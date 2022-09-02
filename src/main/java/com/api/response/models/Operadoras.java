package com.api.response.models;

public  class Operadoras{

    protected  String nomeOperadora;
    protected String cod;

    public Operadoras(String nomeOperadora, String cod) {
        this.nomeOperadora = nomeOperadora;
        this.cod = cod;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
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
                "nomeOperadora='" + nomeOperadora + '\'' +
                ", cod='" + cod + '\'' +
                '}';
    }
}
