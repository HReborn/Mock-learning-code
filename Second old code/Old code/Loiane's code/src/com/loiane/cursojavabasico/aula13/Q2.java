package com.loiane.cursojavabasico.aula13;

import java.util.Scanner;

// Do a script that asks for a number and then show the message "The number you choose was [number]"

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Tell me your favorite number:");
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        System.out.println("I'm amazed by this " + inputNumber + ". You sure know how to choose, huh? ;D");
        scan.close();
    } {
        
    }
}
