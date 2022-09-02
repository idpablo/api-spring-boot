package com.api.response.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class oepradorasTest {
    @Test
    public void agendateste() {
        Map<Contacts, Operadoras> map = new HashMap<>();
        ArrayList arrayList = new ArrayList<String>();

        Contacts c1 = new Contacts("Contato1", "61 9999 9999", "contato1@teste.com");
        Operadoras oi = new Operadoras("Oi", "15");

        arrayList.add(c1);

        map.put(c1, oi);

        System.out.println(map);
    }
}
