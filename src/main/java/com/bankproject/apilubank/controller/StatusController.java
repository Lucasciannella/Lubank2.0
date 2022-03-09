package com.bankproject.apilubank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //uma aplicação rest
public class StatusController {

    @GetMapping(path = "/api/status") // mapeia o endereço deste metodo;
    public String check(){

        return "online";
    }

}
