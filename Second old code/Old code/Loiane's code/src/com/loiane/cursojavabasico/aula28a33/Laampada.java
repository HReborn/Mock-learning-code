package com.loiane.cursojavabasico.aula28a33;

public class Laampada {

    private int voltagem; // volts
    private int amperagem; // amperes
    private int tempoVidaUtil; // anos
    private boolean status;

    public int getVoltagem() {
        return this.voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public int getAmperagem() {
        return this.amperagem;
    }
    public void setAmperagem(int amperagem) {
        this.amperagem = amperagem;
    }
    public int getTempoVidaUtil() {
        return this.tempoVidaUtil;
    }
    public void setTempoVidaUtil(int tempoVidaUtil) {
        this.tempoVidaUtil = tempoVidaUtil;
    }
    public boolean isStatus() {
        return this.status;
    }
    public boolean getStatus() {
        return this.status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Laampada() { }

    public Laampada(int voltagem, int amperagem, int tempoVidaUtil, boolean status) {
        this.voltagem = voltagem;
        this.amperagem = amperagem;
        this.tempoVidaUtil = tempoVidaUtil;
        this.status = status;
    }

    public void showStatus() {
        if (this.status) {
            System.out.println("A lâmpada está ligada");
        } else {
            System.out.println("A lâmpada está desligada");
        }
    }
    public void showAmperagem() {
        System.out.println("A amperagem é: " + this.amperagem);
    }
    public void showVoltagem() {
        System.out.println("A voltagem é: " + this.voltagem);
    }
    public void showtempoVidaUtil() {
        System.out.println("A tempoVidaUtil é: " + this.tempoVidaUtil);
    }

    public void ligar() {
        if (this.status) {
            System.out.println("A lâmpada já está ligada.");
        } else {
            this.status = true;
            System.out.println("Você ligou a lâmpada.");
        }
    }

    public void desligar() {
        if (!this.status) {
            System.out.println("A lâmpada já está desligada.");
        } else {
            this.status = false;
            System.out.println("Você desligou a lâmpada.");
        }
    }

    public void switchStatus() {
        if (this.status) {
            this.status = false;
            System.out.println("Você desligou a lâmpada.");
        } else {
            this.status = true;
            System.out.println("Você ligou a lâmpada.");
        }
    }   
}
