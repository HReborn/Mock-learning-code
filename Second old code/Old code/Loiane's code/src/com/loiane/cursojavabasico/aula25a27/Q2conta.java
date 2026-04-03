package com.loiane.cursojavabasico.aula25a27;

public class Q2conta {
    public static void main(String[] args) {


        double deposito = 1442;
        double saque = 1241.00;
        double saqueGrande = 34654625;

        System.out.println();

        Conta.consultarEspecial();
        Conta.consultarId();
        Conta.consultarLimite();

        System.out.println();

        Conta.consultarSaldo();;
        Conta.sacar(saque);
        Conta.consultarSaldo();

        System.out.println();

        Conta.consultarSaldo();
        Conta.depositar(deposito);
        Conta.consultarSaldo();

        System.out.println();

        Conta.consultarSaldo();
        Conta.sacar(saqueGrande);
    }
}
