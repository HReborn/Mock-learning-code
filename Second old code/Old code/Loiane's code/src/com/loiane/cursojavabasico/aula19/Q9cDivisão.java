package com.loiane.cursojavabasico.aula19;
import java.util.Scanner;

public class Q9cDivisão {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar 10 números inteiros e construir um novo arranjo de números baseado neles.");
        int[] A = new int[10];
        double[] B = new double[10];
        double[] C = new double[10];
        String resultC = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira abaixo o inteiro da posição A" + (i+1) + ".");
            A[i] = scan.nextInt();
            System.out.println("Insira abaixo o inteiro da posição B" + (i+1) + ".");
            B[i] = scan.nextInt();
            C[i] = A[i] / B[i];
            resultC = resultC + ("" + C[i] + " - ");
        }    
        System.out.println("Resultado de A/B é: " + resultC);
        scan.close();
    }
}
