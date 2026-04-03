package com.loiane.cursojavabasico.aula13;

import java.util.Scanner;

// Do a script that asks for two numbers and then show the sum"

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Tell me two good numbers and i'll show you something cool.");
        Scanner scan = new Scanner(System.in);
        int numberOne = scan.nextInt();
        int numberTwo = scan.nextInt();
        int numberSum = numberOne + numberTwo;
        System.out.println("Voilá: " + numberSum + ".");
        scan.close();
    } {
    
    }
}
