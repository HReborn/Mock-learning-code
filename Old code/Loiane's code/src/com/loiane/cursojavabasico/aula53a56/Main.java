package com.loiane.cursojavabasico.aula53a56;

public class Main {
    public static void main(String[] args) {
        CalculadoraEnum soma = CalculadoraEnum.SOMAR;
        CalculadoraEnum subtrair = CalculadoraEnum.SUBTRAIR;
        CalculadoraEnum dividir = CalculadoraEnum.DIVIDIR;
        CalculadoraEnum multiplicar = CalculadoraEnum.MULTIPLICAR;

        // resultado 100 em todos
        System.out.println(soma.executarOperacao(50, 50));
        System.out.println(subtrair.executarOperacao(200, 100));
        System.out.println(dividir.executarOperacao(1000, 10));
        System.out.println(multiplicar.executarOperacao(10, 10));
    }
}
