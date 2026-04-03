package com.loiane.cursojavabasico.aula16e17;
import java.util.Scanner;

public class Q20idadePessoas {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa vai perguntar a idade de todas as pessoas no grupo e dizer se a turma em geral é velha ou jovem.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira abaixo quantas pessoas tem no grupo.");
        int qtdPessoas = scan.nextInt();
        System.out.println("Insira abaixo a idade dos participantes aenas uma vez por pessoa.");
        int somaIdade = 0;
        for (int i = 1; (i < qtdPessoas+1); ++i) {
            System.out.println("Insira a idade da pessoa de número " + i + ".");
            int idadeAtual = scan.nextInt();
            somaIdade = somaIdade + idadeAtual;
        }
        double mediaIdade = somaIdade/qtdPessoas;
        String classificacao = "";
        if (mediaIdade < 26) {
            classificacao = "Jovem.";
        } else if (mediaIdade < 60 && mediaIdade >= 26) {
            classificacao = "Adulta.";
        } else {
            classificacao = "Idosa.";
        }
        System.out.println("A média do seu grupo é " + mediaIdade + " anos.");
        System.out.println("O programa determinou que o seu grupo é " + classificacao);
        scan.close();
    }
}