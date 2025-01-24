package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/session-login")
public class SessionEnsyuController {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String index(){
        return "session-login-form";
    }

    @RequestMapping("/input-info")
    public String inputInfo(String email,String pass){
        session.setAttribute("email",email);
        session.setAttribute("pass",pass);
        String keyemail ="test@example.com";
        String keypass ="123";
        
        if(email.equals(keyemail) && pass.equals(keypass)){
            return "result-session-login";
        } else{
            return "session-login-form";
        }
        
    }

    @RequestMapping("/mypage")
    public String myPage(){
        if(session.getAttribute("email")==null || session.getAttribute("pass") == null){
            return "redirect:/session-login"; //redirectにすることで他のブラウザでログインした時にURLが変わる　
        }                                     //redirectのあとは戻りたいURL名(HTMLではない)を指定する
            return "result-session-mypage";
        }
       
    }




