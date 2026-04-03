package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai calcular a área de um círculo ao fornecer o raio dele.");
        System.out.println("Por favor, insira o raio que você deseja que o círculo tenha em metros.");
        double raio = scan.nextDouble();
        double area = 3.14*(Math.pow(raio,2));
        System.out.println("Obrigado. A área de um círculo com raio "+ raio +" metros é: " + area + " metros.");
        scan.close();
    }
}
