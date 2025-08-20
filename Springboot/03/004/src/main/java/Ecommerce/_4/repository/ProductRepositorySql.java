package Ecommerce._4.repository;

import Ecommerce._4.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepositorySql {
    private final JdbcTemplate jdbcTemplate;

    public List<Product> getAllProducts(){
        String sql = "SELECT * FROM product";
        var rowMapper = BeanPropertyRowMapper.newInstance(Product.class);
        List<Product> products = jdbcTemplate.query(sql,rowMapper);
        return products;
    }
}
