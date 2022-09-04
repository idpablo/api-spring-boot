package com.api.response.models;

public  class Operadoras{

    protected  String nome;
    protected String codigo;
    protected String categoria;

    public Operadoras(String nomeOperadora, String codigo, String categoria) {
        this.nome = nomeOperadora;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Operadoras{" +
                "nomeOperadora='" + nome + '\'' +
                ", cod='" + codigo + '\'' +
                '}';
    }
}
