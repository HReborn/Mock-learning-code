package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q31salAnual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! O programa vai calcular o salário atual com o aumento salarial anual a partir do ano 1995.");
        System.out.println("Insira abaixo o salário que o usuáro tinha no ano de 1995.");
        double salario = scan.nextDouble();
        System.out.println("Insira abaixo qual o ano do qual deseja saber quanto era o salário atual do usuário nesse ano.");
        int anoFinal = scan.nextInt();
        double percentual = 0.015;

        for (int i = 1995; i < anoFinal; i++) {
            percentual = percentual*2;
            System.out.println("" + percentual);
            salario = salario*(percentual+1);
        }
        System.out.println("Salário do ano de " + anoFinal + " é: " + salario);
        scan.close();
    }
}
