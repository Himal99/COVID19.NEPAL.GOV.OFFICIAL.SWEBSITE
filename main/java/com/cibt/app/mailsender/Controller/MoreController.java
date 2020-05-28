package com.cibt.app.mailsender.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/more")
public class MoreController {
   
    @GetMapping
    
    public String more(){
        return "more/index";
    }

    @GetMapping(value = "/table")
    public String table(){
        return "more/table";
    }
    @GetMapping(value = "/romour")
    public String romour(){
        return "more/romour";
    }

    @GetMapping(value = "/symtoms")
    public String symtoms(){
        return "more/symtoms";
    }
}