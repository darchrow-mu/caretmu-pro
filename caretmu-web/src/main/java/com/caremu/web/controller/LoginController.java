package com.caremu.web.controller;

import com.caremu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.CookieGenerator;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by darchrow on 2015/11/13.
 */
@Controller
@RequestMapping("/uc")
public class LoginController {

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ModelAndView loginPage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login/login");
        mv.addObject("pageTitle", "hello world!");
        return mv;
    }

    @ResponseBody
    @RequestMapping(value = "/getUserInfo/{id}", method = RequestMethod.GET)
    public User getUserInfo(@PathVariable("id") long uid){
        User user = new User();
        user.setUid(uid);
        user.setUserName("mylingc");
        user.setBirthDay(new Date());
        return user;
    }
}
