package main.com.learn.spring.aop.yuanma.advice;

import main.com.learn.spring.aop.yuanma.utils.AllTest;
import main.com.learn.spring.user.po.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NormalService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void someMethod() {
        logger.info("---NormalService: someMethod invoked---");
    }


    public String test(String name) {
        logger.info("---NormalService: test invoked---");
        return "服务一切正常";
    }

    @AllTest
    public String setUser(User user) {
        return "服务一切正常";
    }
}
