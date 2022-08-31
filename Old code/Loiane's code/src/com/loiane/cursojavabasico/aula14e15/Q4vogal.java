package com.loiane.cursojavabasico.aula14e15;
import java.util.Scanner;

public class Q4vogal {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Esse programa aceita uma letra única de input e dirá se ela é vogal, consoante ou outro tipo.");
        
        System.out.println("Insira abaixo a letra a ser checada.");
        Scanner scan = new Scanner(System.in);

        String letra = scan.next();

        if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u" || letra == "A" || letra == "E" || letra == "I" || letra == "O" || letra == "U") {
            System.out.println("A letra pertence às vogais.");
        } else {
            System.out.println("A letra pertence às consoantes.");
        }
        scan.close();
    }
}
