package com.accp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BillController {


    @RequestMapping("/billList")
    public String billList(){
        return "jsp/billlist";
    }
    @RequestMapping("/billModify")
    public String billModify(){
        return "jsp/billmodify";
    }
    @RequestMapping("/billAdd")
    public String billAdd(){
        return "jsp/billadd";
    }

    @RequestMapping("/billView")
    public String billView(){
        return "jsp/billview";
    }
}
