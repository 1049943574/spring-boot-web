package com.fcl.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author MrLcf
 * @create2020-01-2116:09
 */
@Controller
public class HelloController {


    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("msg","成功");
        System.out.println("----");
        return "success";
    }




}
