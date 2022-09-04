package com.api.response.controllers;

import com.api.response.models.Contacts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AgendaController{

    @GetMapping(path = "/agenda")
    public Object[] agenda(){
        ArrayList arrayList = new ArrayList<String>();

        Contacts c1 = new Contacts("Contato1", "61 9999 9999", "contato1@teste.com");
        Contacts c2 = new Contacts("Contato2", "62 9999 9999", "contato2@teste.com");
        Contacts c3 = new Contacts("Contato3", "63 9999 9999", "contato3@teste.com");
        Contacts c4 = new Contacts("Contato4", "64 9999 9999", "contato4@teste.com");
        Contacts c5 = new Contacts("Contato5", "65 9999 9999", "contato5@teste.com");

        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        arrayList.add(c4);
        arrayList.add(c5);

        return arrayList.toArray();
    }
}

