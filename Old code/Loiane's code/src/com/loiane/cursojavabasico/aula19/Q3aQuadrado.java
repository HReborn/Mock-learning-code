package com.loiane.cursojavabasico.aula19;
import java.util.Scanner;

public class Q3aQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar 10 números inteiros e construir um novo arranjo de números baseado neles.");
        int[] A = new int[10];
        int[] B = new int[10];
        String resultB = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira abaixo o inteiro da posição A" + (i+1) + ".");
            A[i] = scan.nextInt();
            B[i] = A[i] * A[i];
            resultB = resultB + ("" + B[i] + " - ");
        }    
        System.out.println("Resultado de A^2 é: " + resultB);
        scan.close();
    }
}
