package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q12folhapag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai simular uma folha de pagamento com os descontos e o FGTS.");

        System.out.println("Insira abaixo o valor da sua hora de trabalho.");
        double valH = scan.nextDouble();

        System.out.println("Insira abaixo o quantas horas você trabalhou esse mês.");
        double totH = scan.nextDouble();

        double sal = valH*totH;
        double fgts = 0.11*sal;
        double sindcato = 0.03*sal;
        double inss = 0.1*sal;
        double pImpRend = 0;

        if (valH < 0 || totH < 0) {
            System.out.println("Valor inválido. Tente novamente.");
        } else if (sal <= 900) {
            pImpRend = 0;
        } else if (sal > 900 && sal <= 1500) {
            pImpRend = 0.05;
        } else if (sal > 1500 && sal <= 2500) {
            pImpRend = 0.1;
        } else {
            pImpRend = 0.2;
        }
        
        double impRend = pImpRend*sal;
        double totDesc = impRend + fgts + sindcato;
        double salLiq = sal - totDesc;

        System.out.println("Salário Bruto                 : R$ " + sal);
        System.out.println("(-) IR (5%)                   : R$ " + impRend);
        System.out.println("(-) INSS (10%)                : R$ " + inss);
        System.out.println("FGTS (11%)                    : R$ " + fgts);
        System.out.println("Total de descontos            : R$ " + totDesc);
        System.out.println("Salário Líquido               : R$ " + salLiq);

        scan.close();
    }
}
