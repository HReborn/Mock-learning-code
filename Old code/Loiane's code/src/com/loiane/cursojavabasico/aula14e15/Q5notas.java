package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q5notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa aceita duas notas parciais de um aluno e vai calcular a média alcançada e avaliar se passou não.");

        System.out.println("Insira abaixo a primeira nota parcial do aluno.");
        double nota1 = scan.nextDouble();

        System.out.println("Insira abaixo a segunda nota parcial do aluno.");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Número inserido é inválido. Tente novamente depois.");
        } else if (media >= 7 && media < 10) {
            System.out.println("Aprovado!");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção!");
        } else {
            System.out.println("Reprovado!");
        }

        scan.close();
    }
}
