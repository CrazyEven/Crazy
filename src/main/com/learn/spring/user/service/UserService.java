package main.com.learn.spring.user.service;

import main.com.learn.spring.user.dao.LoginLogDao;
import main.com.learn.spring.user.dao.UserDao;
import main.com.learn.spring.user.po.LoginLog;
import main.com.learn.spring.user.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String userName, String password) {
        int matchCount = userDao.getMatchCount(userName, password);
        return matchCount > 0;
    }

    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    public User findUserByName(String userName) {
        return userDao.findUserByName(userName);
    }

    public void loginSuccess(User user) {
        LoginLog loginLog = new LoginLog();
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());
        loginLog.setUserId(user.getUserId());
        loginLogDao.insertLoginLog(loginLog);
    }
}
