package com.loiane.cursojavabasico.aula44a46.aula44;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
