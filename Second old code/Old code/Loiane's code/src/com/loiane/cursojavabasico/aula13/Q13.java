package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai calcular seu salário.");
        System.out.println("Mais especificamente: o salário bruto, quanto pagou ao INSS, quanto pagou ao sindicato, o desconto total e o salário líquido.");
        System.out.println("Por favor, insira abaixo quantas horas trabalhou no mês.");
        int horas = scan.nextInt();
        System.out.println("Obrigado. agora insira abaixo quanto você ganha por hora por favor.");
        double valorHora = scan.nextDouble();
        double salBruto = valorHora*horas;
        double inss = salBruto*0.08;
        double imposto = salBruto*0.11;
        double sindicato = salBruto*0.05;
        double descontos = inss + imposto + sindicato;
        double salLiquid = salBruto - descontos;
        System.out.println("Salário bruto: " + salBruto + " reais.");
        System.out.println("Imposto de renda: " + imposto + " reais.");
        System.out.println("INSS: " + inss + " reais.");
        System.out.println("Sindicato: " + sindicato + " reais.");
        System.out.println("Soma dos descontos: " + descontos + " reais.");
        System.out.println("Salário líquido: " + salLiquid + " reais.");
        scan.close();
    }
}
