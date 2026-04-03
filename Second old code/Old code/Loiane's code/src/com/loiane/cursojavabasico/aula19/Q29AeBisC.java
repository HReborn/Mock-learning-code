package com.loiane.cursojavabasico.aula19;
import java.util.Scanner;

public class Q29AeBisC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar 10 números inteiros e construir um novo arranjo de números baseado neles.");
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        String resultC = "";
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.println("Insira abaixo o inteiro da posição A" + (i+1) + ".");
                A[i] = scan.nextInt();
                System.out.println("Insira abaixo o inteiro da posição B" + (i+1) + ".");
                B[i] = scan.nextInt();
                C[i] = A[i];
            } else {
                C[i] = B[i-10];
            }
            resultC = resultC + ("" + C[i] + " - ");
        }
        System.out.println("O resultado da junção de A com B é: ");
        System.out.println(resultC);
        scan.close();
    }
}
