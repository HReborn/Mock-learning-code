package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai calcular o seu peso ideal baseado na sua altura.");
        System.out.println("Por favor, insira a sua altura em metros abaixo.");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7*altura) - 58;
        System.out.println("O seu peso ideal é: " + pesoIdeal + "kg.");
        scan.close();
    }
}
