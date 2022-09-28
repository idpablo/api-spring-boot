package com.api.response.models;

import com.api.response.models.entities.Contacts;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class contactsTest {
        @Test
        public void ccteste() {
            ArrayList arrayList = new ArrayList<String>();

            Contacts c1 = new Contacts("Contato1", "61 9999 9999", "contato1@teste.com");
            Contacts c2 = new Contacts("Contato2", "62 9999 9999", "contato2@teste.com");
            Contacts c3 = new Contacts("Contato3", "63 9999 9999", "contato3@teste.com");

            System.out.println(arrayList);

            System.out.println("\nImplementanto testes de Array");
            System.out.println("O Array esta vazio(.isEmpty)?" + arrayList.isEmpty());
            System.out.println("O contato 'c2' pertence ao Array(.contains)? " + arrayList.contains(c2));
            System.out.println("Qual o tamanho do Array(.size)?" + arrayList.size());

            System.out.println("\nAdiciona novo contato no inicio do Array(.add):");
            Contacts c4 = new Contacts("Contato4", "64 9999 9999", "contato4@teste.com");
            arrayList.add(0, c4);

            System.out.println(arrayList);

            System.out.println("\nRemover contato adicionado na posição 0(.remove):" + arrayList.remove(0));

            System.out.println(arrayList);


        }
    }
