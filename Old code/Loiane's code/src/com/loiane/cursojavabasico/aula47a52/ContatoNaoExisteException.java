package com.loiane.cursojavabasico.aula47a52;

public class ContatoNaoExisteException extends Exception {
    
    private String nome;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContatoNaoExisteException() {
    }
    public ContatoNaoExisteException(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "O contato de nome: " + this.nome + " não existe.";
    }
}