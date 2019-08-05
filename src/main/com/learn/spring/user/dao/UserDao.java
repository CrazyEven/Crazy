package main.com.learn.spring.user.dao;

import main.com.learn.spring.user.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {


    //@Resource的作用相当于@Autowired，只不过@Autowired按byType自动注入，而@Resource默认按 byName自动注入罢了。
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password) {
        String sql = "SELECT COUNT(*) FROM S_USER WHERE USER_NAME = ? AND PASSWORD = ? ";
        return jdbcTemplate.queryForObject(sql, new Object[]{userName, password}, Integer.class);
    }

    public User findUserByName(String userName) {
        String sql = "SELECT * FROM S_USER WHERE USER_NAME = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{userName}, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUserId(resultSet.getInt("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setPassword(resultSet.getString("password"));
                user.setLastIp(resultSet.getString("last_ip"));
                user.setLastVisit(resultSet.getDate("last_visit"));
                return user;
            }
        });
    }

    public User findUserByUserName(String userName) {
        String sql = "SELECT * FROM S_USER WHERE USER_NAME = ?";
        final User user = new User();
        jdbcTemplate.query(sql, new Object[]{userName}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUserId(resultSet.getInt("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setPassword(resultSet.getString("password"));
                user.setLastIp(resultSet.getString("last_ip"));
                user.setLastVisit(resultSet.getDate("last_visit"));
            }
        });
        return user;
    }

    public void updateLoginInfo(User user) {
        String sqlStr = "UPDATE S_USER SET last_visit = ?,last_ip = ? where user_id = ?";
        jdbcTemplate.update(sqlStr, new Object[]{user.getLastVisit(), user.getLastIp(), user.getUserId()});
    }
}
