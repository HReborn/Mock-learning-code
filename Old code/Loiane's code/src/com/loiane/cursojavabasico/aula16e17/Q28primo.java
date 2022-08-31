package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q28primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa irá analisar quantos e quaisquer números primos você quiser.");
        int continuee = 1;
        int numero = 0;
        int primo = 1;
        while (continuee == 1) {
            primo = 1;
            System.out.println("Digite abaixo o número que gostaria de checar: ");
            numero = scan.nextInt();
            for (int i = 1; i < 51; i++) {
                if (numero % i == 0 && i != 1 && i != numero) {
                    System.out.println("O número em questão é não primo.");
                    primo = 0;
                    break;
                }
            }
            if (primo == 1) {
                System.out.println("O número em questão é primo.");
            }
            System.out.println("Digite \"1\" se você quiser testar outro número. ");
            continuee = scan.nextInt();

        }
        scan.close();
    }
}
