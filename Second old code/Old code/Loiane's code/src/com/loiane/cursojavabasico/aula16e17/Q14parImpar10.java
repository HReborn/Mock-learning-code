package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q14parImpar10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo. Esse programa vai pedir 10 números inteiros e dizer quantos são pares e quais são ímpares");
        int par = 0;
        int impar = 0;
        for (int i = 0; i <= 9; ++i){
            System.out.println("Insira o número de posiçao " + (i+1) + ".");
            int numero = scan.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("A quantidade de números ímpares é: " + impar);
        System.out.println("A quantidade de números par é: " + par);
        scan.close();
    }
}
