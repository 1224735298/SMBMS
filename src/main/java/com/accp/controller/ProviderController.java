package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProviderController {


    @RequestMapping("/providerList")
    public String providerList(){
        return "jsp/providerlist";
    }
    @RequestMapping("/providerModify")
    public String providerModify(){
        return "jsp/providermodify";
    }
    @RequestMapping("/providerAdd")
    public String providerAdd(){
        return "jsp/provideradd";
    }
    @RequestMapping("/providerView")
    public String providerView(){
        return "jsp/providerview";
    }
}
