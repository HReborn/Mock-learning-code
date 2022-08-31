package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q13Dsem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai aceitar um número de 1-7 e dizer qual o dia da semana correspondente.");

        System.out.println("Insira abaixo o número desejado.");
        int dia = scan.nextInt();

        switch (dia) {
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 1: System.out.println("Domingo"); break;
            case 7: System.out.println("Sábado"); break;
            default: System.out.println("Valor inválido!"); break;
        }
        scan.close();
    }
}
