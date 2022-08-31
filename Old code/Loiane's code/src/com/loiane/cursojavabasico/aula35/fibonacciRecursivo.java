package com.loiane.cursojavabasico.aula35;

public class fibonacciRecursivo {
    static int soma;
    static int nPrev = 1;
    static int nActu = 1;
    static int counter = 0;

    public static void main(String[] args) {
        fibo(8);
    }

    public static int fibo(int n) {
        ++counter;
        if (n == 1) {
            soma = 1;
            System.out.println(soma);
            return soma;
        } else if (n == 2) {
            soma = 1;
            System.out.println(soma);
            return soma;
        }
        soma = nActu + nPrev;
        nPrev = nActu;
        nActu = soma;
        if (counter == n-2) {
            System.out.println(soma);
            return soma;
        }
        fibo(n);
        return soma;
    }
}