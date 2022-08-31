package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q1nota0a10 {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa vai pedir um número inteiro entre 0 e 10. Obs: Não vale roubar.");
        int continuee = 1;
        Scanner scan = new Scanner(System.in);
        int valor = 0;
        System.out.println("Insira algum número abaixo.");
        valor = scan.nextInt();
        while (continuee == 1) {
            if (valor < 0 || valor > 10) {
                System.out.println("Insira abaixo o número de acordo com o que foi pedido por favor.");
                valor = scan.nextInt();
            } else {
                continuee = 0;
                System.out.println("Obrigado por inserir o número corretamente.   :) ");
            }
        }
        scan.close();
    }    
}
