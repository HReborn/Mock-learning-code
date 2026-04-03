package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q2printSinal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar um número de entrada e vai dizer se ele é positivo ou negativo.");
        
        System.out.println("Insira abaixo o número que deseja checar.");
        double num1 = scan.nextDouble();

        if (num1 > 0) {
            System.out.println("O número inserido é positivo.");
        } else if (num1 < 0) {
            System.out.println("O número inserido é negativo.");
        } else {
            System.out.println("O número inserido é nulo.");
        }
        scan.close();
    }
}
