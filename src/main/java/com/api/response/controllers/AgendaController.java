package com.api.response.controllers;

import com.api.response.models.entities.Contact;
import com.api.response.models.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/agenda")
public class AgendaController {

    @Autowired
    ContactRepository contactRepository;

    @PostMapping
    public @ResponseBody
    Contact newContact(@Valid Contact contact) {
        contactRepository.save(contact);
        return contact;
    }

    @GetMapping
    public Iterable<Contact> consultAllContacts(){
        return contactRepository.findAll();
    }
}