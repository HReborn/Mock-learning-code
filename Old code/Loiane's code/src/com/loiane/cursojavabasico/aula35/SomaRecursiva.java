package com.loiane.cursojavabasico.aula35;

public class SomaRecursiva {
    static int soma = 0;
    static int prevNum = 0;
    public static void main(String[] args) {    
        int numTeste = 7;
        int summ = somaRecursiva(numTeste);
        System.out.println(summ);
    }
    public static int somaRecursiva(int numero) {
        if (numero <= 0) {
            return 0;
        }
        soma += ++prevNum; 
        if (prevNum == numero) {
            return soma;
        }
        somaRecursiva(numero);
        return soma;
    }
}