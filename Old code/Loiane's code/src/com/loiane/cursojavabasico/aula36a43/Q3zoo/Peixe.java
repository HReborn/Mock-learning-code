package com.loiane.cursojavabasico.aula36a43.Q3zoo;

public class Peixe extends Animal {
    String caracteristicas;

    public String getCaracteristicas() {
        return this.caracteristicas;
    }
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Peixe() {
    }
    public Peixe(String nome, double comprimento, double velocidade) {
        super(nome, comprimento, velocidade);
        this.caracteristicas = "Barbatanas e cauda.";
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
            " Característica: " + getCaracteristicas();
    }
}
