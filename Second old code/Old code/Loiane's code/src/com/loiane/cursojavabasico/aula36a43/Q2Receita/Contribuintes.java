package com.loiane.cursojavabasico.aula36a43.Q2Receita;

public abstract class Contribuintes {
    private String nome;
    private double rendaBruta;
    private double imposto;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getRendaBruta() {
        return this.rendaBruta;
    }
    public void setRendaBruta(double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }
    public double getImposto() {
        return this.imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public Contribuintes() {
    }
    public Contribuintes(String nome, double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract void CalcularImposto();

    public void mostrarImposto() {
        System.out.println(this.nome + ": " + this.imposto);
    }
}
