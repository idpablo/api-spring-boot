package com.api.response.controllers;

import com.api.response.models.entities.Contacts;
import com.api.response.models.repository.ContactsRepository;
import com.api.response.models.entities.Operadoras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/agenda")
public class OperadorasController {

    @Autowired
    ContactsRepository contactsRepository;

    @PostMapping
    public @ResponseBody Contacts newContacts(
                         @RequestParam(name = "nome") String nome,
                         @RequestParam(name = "telefone") String telefone,
                         @RequestParam(name = "email") String email){

        Contacts contact = new Contacts(nome, telefone, email);
        contactsRepository.save(contact);
        return contact;
    }
}
