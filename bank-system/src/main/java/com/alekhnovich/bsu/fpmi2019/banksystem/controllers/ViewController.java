package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/greetings")
    public String getGritPage(@RequestParam(name = "name",required = false,defaultValue = "LOL")String name, Model model){
        model.addAttribute("name",name);
        return "greetings";
    }
}
