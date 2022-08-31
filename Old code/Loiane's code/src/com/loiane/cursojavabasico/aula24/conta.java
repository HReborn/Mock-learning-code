package com.loiane.cursojavabasico.aula24;

public class conta {
    public static void main(String[] args) {

        Banco conta1 = new Banco();
        conta1.numeroDeConta = 2837467;
        conta1.saldo = 28.32;
        conta1.isSpecial = true;
        conta1.limite = 10000.00;
    }
}