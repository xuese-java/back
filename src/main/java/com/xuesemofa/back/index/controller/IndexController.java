package com.xuesemofa.back.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("redirect:/page/login/login");
    }

    @RequestMapping("/page/{a}/{b}")
    public ModelAndView page(@PathVariable("a") String a, @PathVariable("b") String b) {
        String path = "/" + a + "/" + b;
        return new ModelAndView(path);
    }
}
