package com.madhav.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * TODO Add In Class Summary
 * <p>
 * TODO Add In Class Description
 *
 * @author 11201174 <br />
 * Copyright 2020 Earthport Plc. All rights reserved.
 */
@Controller
public class HelloWorld
{
    @RequestMapping("/")
    public ModelAndView m1(){
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;
    }
}
