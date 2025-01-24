package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculation")

public class calcController {

    @RequestMapping("")
    public String index(){
        return "calcSum-form";
    }

    // @RequestMapping("/input-num")
    
    // public int calculation(String num1, String num2){
    //     int result = Integer.parseInt(num1);
    //     int result2 = Integer.parseInt(num2);
    //     int answer = result + result2;

    



    }



