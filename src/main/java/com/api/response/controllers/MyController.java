package com.api.response.controllers;

import com.api.response.models.Contacts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(path = "/agenda")
    public Contacts agenda(){
        return new Contacts("Pablo", "62 99845-0207", "Vivo");
    }
}
