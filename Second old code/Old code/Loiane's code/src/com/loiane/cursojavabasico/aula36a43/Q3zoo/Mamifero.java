package com.loiane.cursojavabasico.aula36a43.Q3zoo;

public class Mamifero extends Animal {
    private String alimento;

    public String getAlimento() {
        return this.alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public Mamifero() {
    }
    public Mamifero(String alimento, String nome, double comprimento, String cor, double velocidade) {
        super(nome, comprimento, cor, velocidade);
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return 
            " Animal: " + super.getNome() + "\n" + 
            " Comprimento: " + super.getComprimento() + " cm\n" + 
            " Patas: " + super.getPatas() + "\n" + 
            " Cor: " + super.getCor() + "\n" + 
            " Ambiente: " + super.getAmbiente() + "\n" + 
            " Velocidade: " + getVelocidade() + " m/s\n" +
            " Alimento: " + getAlimento();
    }

}
