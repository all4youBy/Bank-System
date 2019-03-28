package com.alekhnovich.bsu.fpmi2019.banksystem.controllers;

import com.alekhnovich.bsu.fpmi2019.banksystem.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    private final ClientService clientService;

    @Autowired
    public ViewController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/greetings")
    public String getGritPage(@RequestParam(name = "name",required = false,defaultValue = "LOL")String name, Model model){
        model.addAttribute("name",name);
        return "greetings";
    }

    @GetMapping("/clientspage")
    public String getClientsPage(Model model){
        model.addAttribute("clients",clientService.getItems());
        return "clients";
    }
}
