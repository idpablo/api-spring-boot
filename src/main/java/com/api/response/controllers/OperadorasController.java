package com.api.response.controllers;

import com.api.response.models.Operadoras;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class OperadorasController {

    @GetMapping(path = "/operadoras")
    public Object[] operadoras(){
        ArrayList arrayList = new ArrayList<>();

        Operadoras operadora1 = new Operadoras("Oi", "15", "Celular");
        Operadoras operadora2 = new Operadoras("Tim", "41", "Celular");
        Operadoras operadora3 = new Operadoras("Claro", "21", "Celular");
        Operadoras operadora4 = new Operadoras("Embratel", "21", "Celular");
        Operadoras operadora5 = new Operadoras("Sercomtel", "43", "Telefone");

        arrayList.add(operadora1);
        arrayList.add(operadora2);
        arrayList.add(operadora3);
        arrayList.add(operadora4);
        arrayList.add(operadora5);

        return arrayList.toArray();
    }

}
