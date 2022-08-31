package com.loiane.cursojavabasico.aula19;
import java.util.Scanner;

public class Q14media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa pede 10 números inteiros e calcula a média dos ímpares desses números.");
        int[] A = new int[10];
        double somaImpar = 0;
        int impar = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira abaixo o inteiro da posição " + (i+1) + ".");
            A[i] = scan.nextInt();
            if (A[i] % 2 != 0){
                impar++;
                somaImpar = somaImpar + A[i];
            }
        }
        double mediaImpar = somaImpar/impar;
        System.out.println("A soma dos números ímpares entre os números fornecidos é: " + somaImpar);
        System.out.println("A média dos números ímpares entre os números fornecidos é: " + mediaImpar);
        scan.close();
    }
}