package main.com.learn.spring.user.web;

import main.com.learn.spring.user.domain.LoginCommand;
import main.com.learn.spring.user.po.User;
import main.com.learn.spring.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@Controller
@Repository(value = "/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage(HttpServletRequest request) {
        System.out.println("------------------------------");
        return "login";
    }

    @RequestMapping(name = "/login", method = RequestMethod.GET)
    public ModelAndView loginCheck(HttpServletRequest request, LoginCommand loginCommand) {
        boolean isVaildUser = userService.hasMatchUser(loginCommand.getUserNmae(), loginCommand.getPassword());
        if (!isVaildUser) {
            return new ModelAndView("login", "error", "用户名或密码错误!");
        } else {
            User user = userService.findUserByUserName(loginCommand.getUserNmae());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);

            request.getSession().setAttribute("user", user);
            return new ModelAndView("main");
        }
    }
}
