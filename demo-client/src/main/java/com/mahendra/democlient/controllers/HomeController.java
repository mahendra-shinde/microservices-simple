package com.mahendra.democlient.controllers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import com.mahendra.democlient.models.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * HomeController
 */
@Controller
@RequestMapping("/")
public class HomeController  {

    @Autowired private RestTemplate template;


    @GetMapping
    public String home(Model map,HttpServletRequest req){
        map.addAttribute("srvhost", req.getRemoteHost());
        map.addAttribute("srvip", req.getRemoteAddr());
        Message message = template.getForObject("http://hello", Message.class);
        map.addAttribute("message", message);
        return "home";
    }
    
}