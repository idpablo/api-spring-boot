package com.api.response.models.repository;

import com.api.response.models.entities.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contacts, Integer> {
}


