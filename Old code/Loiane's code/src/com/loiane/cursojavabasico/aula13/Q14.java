package com.loiane.cursojavabasico.aula13;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai calcular o tempo em minutos que leva pra baixar algum arquivo dada a velocidade da internet e o tamanho do arquivo.");
        System.out.println("Por favor, insira abaixo a velocidade da sua internet em MB/s.");
        double velo = scan.nextDouble();
        System.out.println("Obrigado. Agora insira abaixo o tamanho do arquivo em MB que deseja baixar, por favor.");
        double sizze = scan.nextDouble();
        double tempo = (velo*sizze)/60;
        System.out.println("O seu arquivo vai demorar " + tempo + " minutos para terminar de baixar.");
        scan.close();
    }
}
