package com.lovejobs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author fengxin
 */
@Controller
public class SecurityController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String index(){
        return "home";
    }

    @RequestMapping(path = "/home",method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(path = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @RequestMapping(path = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        return "login";
    }

    @RequestMapping(path = "/login",method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(path = "/logout",method = RequestMethod.POST)
    public String logout(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        return "logout";
    }
}
