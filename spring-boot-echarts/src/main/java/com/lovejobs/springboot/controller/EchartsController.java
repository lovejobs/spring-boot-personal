package com.lovejobs.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EchartsController {


    @RequestMapping(value="/first",method = RequestMethod.GET)
    public ModelAndView firstDemo(){

        return new ModelAndView("test");//跟templates文件夹下的test.html名字一样，返回这个界面

    }
}
