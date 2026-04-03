package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q10turnoMVN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai comprimentá-lo dependendo da hora do dia que você está caso digite M(matutino), V(vespertino) ou N(noturno");

        String turno = scan.next();

        switch(turno){
            case "m":
            case "M": System.out.println("Bom dia!"); break;
            case "v":
            case "V": System.out.println("Boa tarde!"); break;
            case "n":
            case "N": System.out.println("Boa noite!"); break;
            default: System.out.println("Valor inválido!");
        }
        scan.close();
    }
}