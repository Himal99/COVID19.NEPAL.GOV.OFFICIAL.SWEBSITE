package com.cibt.app.mailsender.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/district")
public class DistrcictController {
    
    @GetMapping
    public String index(){
        return "district/index";
    }
}