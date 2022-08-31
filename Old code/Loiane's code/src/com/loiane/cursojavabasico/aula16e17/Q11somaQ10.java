package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q11somaQ10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai imprimir os números no intervalo entre os dois inteiros que serão fornecidos. O primeiro número deve ser menor que o segundo.");
        System.out.println("Insira abaixo o primeiro inteiro.");
        int int1 = scan.nextInt();
        System.out.println("Insira abaixo o segundo número inteiro.");
        int int2 = scan.nextInt();
        int numAtual = int1 +1;
        int somaIntervalo = numAtual;
        if (int2 - int1 > 1) {
            while (numAtual < int2) {
                System.out.println("O próximo número é: " + numAtual++);
                somaIntervalo = somaIntervalo + numAtual;
            }
        } else {
            System.out.println("Não há nenhum número entre esses dois inteiros porque são consecutivos.");
        }
        System.out.println("A soma de todos os números no intervalo é: " + (somaIntervalo - int2));
        scan.close();
    }
}
