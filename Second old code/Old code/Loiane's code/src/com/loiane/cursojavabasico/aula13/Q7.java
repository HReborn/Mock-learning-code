package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa vai calcular a o dobro da área de um quadrado.");
        System.out.println("Por favor, insira o lado do quadrado em metros que deseja calcular.");
        Scanner scan = new Scanner(System.in);
        double lado = scan.nextDouble();
        double dobroArea = 2*Math.pow(lado,2);
        System.out.println("Obrigado. O dobro da área de um quadrado com lado " + lado + " metros é: " + dobroArea + " metros.");
        scan.close();
    }
}