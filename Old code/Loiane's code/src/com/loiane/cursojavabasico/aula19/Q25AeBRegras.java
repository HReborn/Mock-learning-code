package com.loiane.cursojavabasico.aula19;
import java.util.Scanner;

public class Q25AeBRegras {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar 10 números inteiros e construir um novo arranjo de números baseado neles.");
        int[] A = new int[10];
        int[] B = new int[10];
        String resultB = "";
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira abaixo o inteiro da posição " + (i+1) + ".");
            A[i] = scan.nextInt();
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0;
            }
            resultB = resultB + ("" + B[i] + " - ");
        }
        System.out.print(resultB);
        scan.close();
    }
}
