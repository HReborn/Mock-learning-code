package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q14media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai aceitar duas notas parciais, calcular a média e avaliar o aluno.");

        System.out.println("Insira abaixo a primeira nota.");
        double nota1 = scan.nextDouble();

        System.out.println("Insira abaixo a segunda nota.");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2)/2;
        String aprovacao = "";
        String conceito = "";

        if (media >= 9 && media <= 10) {
            conceito = "A";
            aprovacao = "APROVADO";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            aprovacao = "APROVADO";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            aprovacao = "APROVADO";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            aprovacao = "REPROVADO";
        } else if (media >= 0 && media < 4) {
            conceito = "E";
            aprovacao = "REPOVADO";
        } else {
            System.out.println("Valor inserido foi inválido.");
        }

        System.out.println("A primeira nota parcial é             : " + nota2);
        System.out.println("A segunda nota parcial é              : " + nota1);
        System.out.println("A média do aluno durante as aulas foi : " + media);
        System.out.println("O conceito obtido durante as aulas foi: " + conceito);
        System.out.println("O resultado do desempenho foi         : " + aprovacao);
        
        scan.close();
    }
}
