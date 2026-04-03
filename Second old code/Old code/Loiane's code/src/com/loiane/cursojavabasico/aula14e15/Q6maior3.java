package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q6maior3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa aceita 3 números e mostra o maior entre eles.");

        System.out.println("Insira abaixo o primeiro número.");
        double num1 = scan.nextDouble();

        System.out.println("Insira abaixo o segundo número.");
        double num2 = scan.nextDouble();
        
        System.out.println("Insira abaixo o terceiro número.");
        double num3 = scan.nextDouble();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1 + ".");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2 + ".");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O maior número é: " + num3 + ".");
        } else {
            System.out.println("Os três números são iguais");
        }
        scan.close();
    }
}