package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q8comprarBarato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa aceita 3 preços de itens e vai decidir qual a melhor opção para comprar.");

        System.out.println("Insira abaixo o preço do primeiro item em reais.");
        double num1 = scan.nextDouble();

        System.out.println("Insira abaixo o preço do segundo item em reais.");
        double num2 = scan.nextDouble();
        
        System.out.println("Insira abaixo o preço do terceiro item em reais.");
        double num3 = scan.nextDouble();
        
        if (num1 < num2 && num1 < num3) {
            System.out.println("O melhor produto a se comprar é o primeiro produto com preço de " + num1 + " reais.");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O melhor produto a se comprar é o segundo produto com preço de " + num2 + " reais.");
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("O melhor produto a se comprar é o terceiro produto com preço de " + num3 + " reais.");
        } else {
            System.out.println("Os três produtos são iguais.");
        }
        scan.close();
    }
}