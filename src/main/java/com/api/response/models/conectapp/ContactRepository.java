package com.api.response.models.conectapp;

import com.api.response.models.conectapp.Contact;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContactRepository extends PagingAndSortingRepository<Contact, Long>,
        JpaSpecificationExecutor<Contact> {
}