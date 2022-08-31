package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q13pow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai calcular o resultado de um número elevado a outro.");
        // Observação: O programa ainda não está implementado com função de calcular com expoente decimal.
        System.out.println("Insira abaixo a base da potência.");
        double lower = scan.nextDouble();
        System.out.println("Insira abaixo o expoente da potência");
        double upper = scan.nextDouble();
        double result = lower;

        if (upper < 0 && lower != 0) {
            upper = -upper;
            for (int i = 0; i < upper - 1; ++i) {
                result = result*lower;
            }
            upper = 1/upper;
        } else if (upper == 0) {
            result = 1;
        } else if (upper > 0) {
            for (int i = 0; i < upper - 1; ++i) {
                result = result*lower;
            }
        }

        if (upper < 0 && lower == 0)  {
            System.out.println("Não é possível utilizar a base zero com expoente negativo.");
        } else {
            System.out.println("O resultado é: " + result);
        }
        
        scan.close();       
    }
}
