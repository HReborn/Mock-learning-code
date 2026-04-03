package com.loiane.cursojavabasico.aula28a33;

public class Conta {
    
    private int id;
    private double saldo;
    private double limite;
    private boolean status;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return this.limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
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

    public Conta() {
    }

    public Conta(int id, double saldo, double limite, boolean status) {
        this.id = id;
        this.saldo = saldo;
        this.limite = limite;
        this.status = status;
    }

    public void sacar(double saque) {
        if (this.saldo - saque >= 0) {
            this.saldo = this.saldo - saque;
            System.out.println("Você sacou com sucesso " + saque + " reais.");
        } else {
            System.out.println("Erro!");
            System.out.println("Você tentou sacar " + saque + " reais.");
            System.out.println("Você não tem dinheiro o suficiente para sacar esse valor.");
        }
    }

    public void depositar(double deposito) {
        this.saldo += deposito;
        System.out.println("Você depositou com sucesso " + deposito + " reais.");
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + this.saldo + " reais.");
    }
    public void consultarId() {
        System.out.println("O número da sua conta é: " + this.id);
    }
    public void consultarEspecial() {
        System.out.println("Cheque especial está em uso: " + this.status);
    }
    public void consultarLimite() {
        System.out.println("O limite da sua conta é: " + this.limite + " reais.");
    }
}