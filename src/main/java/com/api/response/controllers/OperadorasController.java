package com.api.response.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OperadorasController {

    @GetMapping(path = "operadoras")
    public void operadoras(){
        ArrayList arrayList = new ArrayList<>()
    }

}
