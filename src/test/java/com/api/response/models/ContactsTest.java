package com.api.response.models;

import org.junit.jupiter.api.Test;

public class ContactsTest {

    @Test
    public void ccteste(){
        Contacts cc = new Contacts();

        cc.setNome("Teste");

        System.out.println(cc.getNome());
    }
}
