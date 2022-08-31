package com.loiane.cursojavabasico.aula44a46.Q1figuraGeometrica;

public class FiguraGeometrica {
    
    private String nome;
    private String cor;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public FiguraGeometrica() {
    }
    public FiguraGeometrica(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

}
