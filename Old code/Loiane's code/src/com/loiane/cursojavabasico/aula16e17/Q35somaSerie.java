package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q35somaSerie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa irá mostrar até \'n\' termos da série e calcular a soma no final.");
        System.out.println("Insira abaixo até quantos termos você gostaria de ver.");
        int n = scan.nextInt();
        double m = 1;
        double termo = 1;
        double soma = 0;
        for (double i = 1; i < n + 1; i++) {
            termo = i/m;
            m = m + 2;
            System.out.println("O termo número " + i + " é: " + termo);
            soma = soma + termo;
        }
        System.out.println("A soma da série até o termo " + n + " é: " + soma);
        scan.close();
    }
    
}
