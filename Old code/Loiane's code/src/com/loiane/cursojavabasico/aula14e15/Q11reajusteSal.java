package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q11reajusteSal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa fará o reajuste salárial dos colaboradores dependendo do valor atual do seu salário.");

        System.out.println("Insira abaixo o valor atual do seu salário em reais.");
        double sal = scan.nextDouble();
        double percentualRe = 0;

        if (sal <= 0) {
            System.out.println("Valor digitado inválido. Tente novamente.");
        } else if (sal <= 280) {
            percentualRe = 1.2;            
        } else if (sal > 280 && sal < 700) {
            percentualRe = 1.15;
        } else if (sal >= 700 && sal < 1500) {
            percentualRe = 1.1;
        } else {
            percentualRe = 1.05;
        }

        double salRe = sal*percentualRe;
        
        double reajuste = salRe - sal;

        System.out.println("     O salário antes do reajuste era: " + sal + " reais.");
        System.out.println("O percentual de aumento aplicado foi: " + percentualRe + "%.");
        System.out.println("              O valor do aumento foi: " + reajuste + " reais.");
        System.out.println("     O novo salário após o aumento é: " + salRe + " reais.");
        scan.close();
 
    }
}
