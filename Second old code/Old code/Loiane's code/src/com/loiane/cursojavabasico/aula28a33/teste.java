package com.loiane.cursojavabasico.aula28a33;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        System.out.println("Deseja começar o jogo da velha? y/n");
        Scanner scan = new Scanner(System.in);
        String comecar = scan.next();
        System.out.println(comecar == "y");
        scan.close();
    }
}