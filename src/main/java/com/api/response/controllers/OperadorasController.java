package com.api.response.controllers;

import com.api.response.models.entities.Contact;
import com.api.response.models.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/agenda")
public class OperadorasController {

    @Autowired
    ContactsRepository contactsRepository;

    @PostMapping
    public @ResponseBody
    Contact newContacts(
                         @RequestParam(name = "nome") String nome,
                         @RequestParam(name = "telefone") String telefone,
                         @RequestParam(name = "email") String email){

        Contact contact = new Contact(nome, telefone, email);
        contactsRepository.save(contact);
        return contact;
    }
}
