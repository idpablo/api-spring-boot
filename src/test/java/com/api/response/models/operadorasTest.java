package com.api.response.models;

import com.api.response.models.entities.Contacts;
import com.api.response.models.entities.Operadoras;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class operadorasTest {
    @Test
    public void agendatest() {
        Map<Contacts, Operadoras> map = new HashMap<>();
        ArrayList arrayList = new ArrayList<String>();

        Contacts c1 = new Contacts("Contato1", "61 9999 9999", "contato1@teste.com");
        Contacts c2 = new Contacts("Contato2", "62 9999 9999", "contato2@teste.com");
        Contacts c3 = new Contacts("Contato3", "63 9999 9999", "contato3@teste.com");
        Contacts c4 = new Contacts("Contato4", "64 9999 9999", "contato4@teste.com");
        Contacts c5 = new Contacts("Contato5", "65 9999 9999", "contato5@teste.com");

        Operadoras operadora1 = new Operadoras("Oi", "15", "Celular");
        Operadoras operadora2 = new Operadoras("Tim", "41", "Celular");
        Operadoras operadora3 = new Operadoras("Claro", "21", "Celular");
        Operadoras operadora4 = new Operadoras("Embratel", "21", "Celular");
        Operadoras operadora5 = new Operadoras("Sercomtel", "43", "Celular");

        map.put(c1,operadora1);
        map.put(c2,operadora2);
        map.put(c3,operadora3);
        map.put(c4,operadora4);
        map.put(c5,operadora5);

        arrayList.add(c1);

        map.put(c1, operadora1);

        System.out.println(map);
    }
}
