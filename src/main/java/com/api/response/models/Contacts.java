package com.api.response.models;

import java.util.List;

public class Contacts {

    private String nome;
    private String telefone;
    private String operadora;

    public Contacts(String nome, String telefone, String operadora) {
        super();
        this.nome = nome;
        this.telefone = telefone;
        this.operadora = operadora;
    }
    public Contacts(){

    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
}
