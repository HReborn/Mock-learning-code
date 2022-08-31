package com.loiane.cursojavabasico.aula13;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa aceita como input 2 números inteiros e um número real e vai calcular as seguintes coisas: ");
        System.out.println("1. O produto do dobro do primeiro com metade do segundo.");
        System.out.println("2. A soma do triplo do primeiro com o terceiro.");
        System.out.println("3. O terceiro elevado ao cubo.");
        System.out.println("Por favor, insira o primeiro número inteiro.");
        int num1 = scan.nextInt();
        System.out.println("Por favor, insira o segundo número inteiro.");
        int num2 = scan.nextInt();
        System.out.println("Por favor, insira o terceiro número real.");
        double num3 = scan.nextDouble();
        double optt1 = 2*num1 + num2/2;
        double optt2 = 3*num1 + num3;
        double optt3 = Math.pow(num3, 3);
        System.out.println("1. " + optt1 + ".");
        System.out.println("2. " + optt2 + ".");
        System.out.println("3. " + optt3 + ".");
        scan.close();
    }
}
