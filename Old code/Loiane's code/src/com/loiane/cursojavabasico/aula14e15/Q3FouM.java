package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q3FouM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vindo! Esse programa vai selecionar seu sexo caso digite F ou M.");

        String sexo = scan.next();

        switch(sexo){
            case "f":
            case "F": System.out.println("Feminino."); break;
            case "m":
            case "M": System.out.println("Masculino."); break;
            default: System.out.println("Sexo inválido!");
        }
        scan.close();
    }
}
