package com.app.controller;

import com.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/18.
 */
@Controller
@RequestMapping(value = "home")
public class HomeController {

    @Autowired
    private UserService userService;
    private final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"" ,"index"}, method = RequestMethod.GET)
    public String index(@ModelAttribute("model") ModelMap model,HttpServletRequest requestHandle) {
        logger.debug("index() is executed!");

        model.addAttribute("globalEnv", "debug");
        model.addAttribute("moduleName", "index");
        model.addAttribute("adminEmail", "liuwei_will@qq.com");

        model.addAttribute("remoteIp", requestHandle.getRemoteAddr());
        model.addAttribute("userList", userService.getDefaultUserList());
        return "index";
    }

    @RequestMapping(value = {"test"}, method = RequestMethod.GET)
    public ModelAndView test(@ModelAttribute("model") ModelMap model,HttpServletRequest requestHandle) {
        logger.debug("index() is executed!");
        ModelAndView modelAndView = new ModelAndView();

        model.put("globalEnv", "debug");
        model.put("moduleName", "test");
        model.put("adminEmail", "liuwei_will@qq.com");

        model.put("remoteIp", requestHandle.getRemoteAddr());
        modelAndView.setViewName("jsp/test");
        modelAndView.addAllObjects(model);
        return modelAndView;
    }
}
