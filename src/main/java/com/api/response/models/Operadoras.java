package com.api.response.models;

public class Operadoras{

    private String nomeOperadora;
    private String cod;

    public Operadoras(String nome, String cod) {
        this.nomeOperadora = nome;
        this.cod = cod;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNome(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Operadoras{" +
                "nome='" + nomeOperadora + '\'' +
                ", cod='" + cod + '\'' +
                '}';
    }
}
