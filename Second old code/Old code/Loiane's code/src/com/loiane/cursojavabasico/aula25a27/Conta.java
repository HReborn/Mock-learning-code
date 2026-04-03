package com.loiane.cursojavabasico.aula25a27;

public class Conta {
    
    static int id = 2354333;
    static double saldo = 2352.231;
    static double limite = 23523.00;
    static boolean status = true;

    static void sacar(double saque) {
        if (Conta.saldo - saque >= 0) {
            Conta.saldo = Conta.saldo - saque;
            System.out.println("Você sacou com sucesso " + saque + " reais.");
        } else {
            System.out.println("Erro!");
            System.out.println("Você tentou sacar " + saque + " reais.");
            System.out.println("Você não tem dinheiro o suficiente para sacar esse valor.");
        }
    }

    static void depositar(double deposito) {
        Conta.saldo += deposito;
        System.out.println("Você depositou com sucesso " + deposito + " reais.");
    }

    static void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + Conta.saldo + " reais.");
    }

    static void consultarId() {
        System.out.println("O número da sua conta é: " + Conta.id);
    }

    static void consultarEspecial() {
        System.out.println("Cheque especial está em uso: " + Conta.status);
    }

    static void consultarLimite() {
        System.out.println("O limite da sua conta é: " + Conta.limite + " reais.");
    }
}