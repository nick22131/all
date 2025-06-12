package example.JdbcTemplete.Repository;

import example.JdbcTemplete.entity.Contact;
import example.JdbcTemplete.rowMapper.ContactRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactRepository {
    private final JdbcTemplate jdbcTemplate;

    public int saveContactMsg(Contact contact){
        String sql = "insert into contact_msg (name, mobile_num , email, subject , message, status," +
        "created_at, created_by) values (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,
                contact.getName(),
                contact.getMobileNum(),
                contact.getEmail(),
                contact.getSubject(),
                contact.getMessage(),
                contact.getStatus(),
                contact.getCreatedAt(),
                contact.getCreatedBy());
    }

    public List<Contact> findMsgsWithStatus(String status)  {
        String sql = "select * from contact_msg where status = ?";
        return jdbcTemplate.query(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, status);
            }
            }, new ContactRowMapper());
        }
    }

