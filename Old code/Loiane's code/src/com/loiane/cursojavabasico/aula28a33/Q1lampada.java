package com.loiane.cursojavabasico.aula28a33;

public class Q1lampada {
    public static void main(String[] args) {
        Laampada lamp = new Laampada(12, 5, 5, false);
        
        // testando os getters
        System.out.println();

        boolean status = lamp.getStatus();
        int voltagem = lamp.getVoltagem();
        int tempoVidaUtil = lamp.getTempoVidaUtil();
        int amperagem = lamp.getAmperagem();
        System.out.println("A amperagem é: " + amperagem);
        System.out.println("A voltagem é: " + voltagem);
        System.out.println("O status é: " + status);
        System.out.println("O tempo de vida útil é: " + tempoVidaUtil);

        System.out.println();
        // testando os setters e testando os shows
        System.out.println();

        lamp.setStatus(false);
        lamp.setAmperagem(10);
        lamp.setTempoVidaUtil(20);
        lamp.setVoltagem(37);
        lamp.showAmperagem();
        lamp.showStatus();
        lamp.showVoltagem();
        lamp.showtempoVidaUtil();

        System.out.println();
        // testando os métodos ligar, desligar e switchStatus
        System.out.println();

        lamp.setStatus(false);
        lamp.ligar();
        lamp.ligar();
        lamp.desligar();
        lamp.desligar();
        lamp.switchStatus();
        lamp.switchStatus();


    }
}
