package com.api.response.controllers;

import com.api.response.models.Contacts;
import com.api.response.models.Operadoras;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AgendaController{

    @GetMapping(path = "/agenda")
    public Object[] agenda(){
        Map<Contacts, Operadoras> map = new HashMap<String>();
        ArrayList arrayList = new ArrayList<String>();

        Contacts c1 = new Contacts("Contato1", "61 9999 9999", "contato1@teste.com");
        Contacts c2 = new Contacts("Contato2", "62 9999 9999", "contato2@teste.com");
        Contacts c3 = new Contacts("Contato3", "63 9999 9999", "contato3@teste.com");
        Contacts c4 = new Contacts("Contato4", "64 9999 9999", "contato4@teste.com");
        Contacts c5 = new Contacts("Contato5", "65 9999 9999", "contato5@teste.com");

        Operadoras operadora1 = new Operadoras("Oi", "15");
        Operadoras operadora2 = new Operadoras("Oi", "15");
        Operadoras operadora3 = new Operadoras("Oi", "15");
        Operadoras operadora4 = new Operadoras("Oi", "15");
        Operadoras operadora5 = new Operadoras("Oi", "15");

        return map;
    }
}

