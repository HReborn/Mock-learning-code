package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai aceitar a temperatura em Celsius e converter para Farenheit.");
        System.out.println("Por favor, insira a temperatura em Celsius que deseja converter.");
        double tempCels = scan.nextDouble();
        double tempFaren = ((9*tempCels)/5) + 32;
        System.out.println("Obrigado. A temperatura em Farenheit é: " + tempFaren + " ºF.");
        scan.close();
    }
}
