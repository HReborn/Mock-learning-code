package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa vai calcular o seu salário a partir do valor da sua hora e da quantidade das horas trabalhadas.");
        System.out.println("Por favor, insira quantas horas você trabalhou esse mês abaixo.");
        Scanner scan = new Scanner(System.in);
        int horas = scan.nextInt();
        System.out.println("Obrigado. Agora insira qual o valor da sua hora de trabalho, por favor.");
        double valorHora = scan.nextDouble();
        double salario = horas*valorHora;
        System.out.println("Seu salário esse mês foi: " + salario + " reais.");
        scan.close();
    }
}
