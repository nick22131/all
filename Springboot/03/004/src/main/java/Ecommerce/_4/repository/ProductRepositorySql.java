package Ecommerce._4.repository;

import Ecommerce._4.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositorySql {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    public List<Product> getAllProducts(){
        String sql = "SELECT * FROM product";
        var rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
        List<Product> products = jdbcTemplate.query(sql,rowMapper);
        return products;
    }

    public int[] batchInsert(List<Product> products)  {
        String sql = """
                  INSERT INTO product (name, price, description)
                VALUES (:name, :price, :description )
                """;
        SqlParameterSource[] batch = products
                .stream()
                .map((product) -> new MapSqlParameterSource()
                        .addValue("name", product.getName())
                        .addValue("price",product.getPrice())
                        .addValue("description", product.getDescription()))
                .toArray((size)->new SqlParameterSource[size]);
        int[] rowUpdated = namedParameterJdbcTemplate.batchUpdate(sql,batch);
        return rowUpdated;
    }

}
