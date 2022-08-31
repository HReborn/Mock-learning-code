package com.loiane.cursojavabasico.aula36a43.Q3zoo;

public class Animal {
    private String nome;
    private double comprimento;
    private int patas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getComprimento() {
        return this.comprimento;
    }
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
    public int getPatas() {
        return this.patas;
    }
    public void setPatas(int patas) {
        this.patas = patas;
    }
    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getAmbiente() {
        return this.ambiente;
    }
    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
    public double getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Animal() {
    }
    public Animal(String nome, double comprimento, String cor, double velocidade) { //se chamado do mamifero
        this.nome = nome;
        this.comprimento = comprimento;
        this.cor = cor;
        this.velocidade = velocidade;
        this.ambiente = "Terra";
        this.patas = 4;
    }
    public Animal(String nome, double comprimento, double velocidade) { //se chamado do peixe
        this.nome = nome;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = 0;
        this.ambiente = "Mar";
        this.cor = "Cinza";
    }
    public Animal(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) { // se for uma instancia de animal
        this.nome = nome;
        this.comprimento = comprimento;
        this.patas = patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return 
            " Animal: " + this.getNome() + "\n" + 
            " Comprimento: " + this.getComprimento() + " cm\n" + 
            " Patas: " + this.getPatas() + "\n" + 
            " Cor: " + this.getCor() + "\n" + 
            " Ambiente: " + this.getAmbiente() + "\n" + 
            " Velocidade: " + this.getVelocidade() + " m/s";
    }
}
