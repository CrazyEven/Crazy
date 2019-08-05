package main.com.learn.spring.user.dao;

import main.com.learn.spring.user.po.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginLogDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){
        String sql = "insert into s_login_log (user_id,ip,login_datetime) values (?,?,?)";
        jdbcTemplate.update(sql,new Object[]{loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()});
    }
}
