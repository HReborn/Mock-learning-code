package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa vai converter a temperatura de Farenheit para Celcius.");
        System.out.println("Por favor, insira a temperatura em Farenheit abaixo.");
        Scanner scan = new Scanner(System.in);
        double tempFaren = scan.nextDouble();
        double tempCels = 5*(tempFaren-32)/9;
        System.out.println("A conversão de Farenheit para Celsius é: " + tempCels + " Cº");
        scan.close();
    }    
}
