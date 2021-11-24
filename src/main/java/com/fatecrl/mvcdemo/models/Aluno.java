package com.fatecrl.mvcdemo.models;

public class Aluno {

    private String nome;
    private String email;
    private int id;
    private int idade;

    public Aluno() {
    }

    public Aluno(String nome, String email, int id, int idade) {
        this.nome = nome;
        this.email = email;
        this.id = id;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
