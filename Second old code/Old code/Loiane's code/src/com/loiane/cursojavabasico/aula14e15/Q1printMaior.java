package com.loiane.cursojavabasico.aula14e15;

import java.util.Scanner;

public class Q1printMaior {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai aceitar a entrada de dois números e vai selecionar o maior entre os dois.");
        
        System.out.println("Insira abaixo o primeiro número.");
        double num1 = scan.nextDouble();

        System.out.println("Insira abaixo o segundo número.");
        double num2 = scan.nextDouble();

        if (num1 > num2) {
            System.out.println("O maior número entre os dois é: " + num1);
        } else if (num1 == num2) {
            System.out.println("Ambos os números são iguais.");
        } else {
            System.out.println("O maior número entre os dois é: " + num2);
        }
        scan.close();
    }
}