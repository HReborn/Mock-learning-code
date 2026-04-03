package com.loiane.cursojavabasico.aula13;

import java.util.Scanner;

// Do a script that asks the 4 yearly grades and show the mean

public class Q5 {
    public static void main(String[] args) {
        System.out.println("Hello, tell me the 4 grades of a student and i'll calculate the mean.");
        Scanner scan = new Scanner(System.in);
        double numberOne = scan.nextDouble();
        double numberTwo = scan.nextDouble();
        double numberThree = scan.nextDouble();
        double numberFour = scan.nextDouble();
        double numberMean = (numberOne + numberTwo + numberThree + numberFour)/4;
        System.out.println("Student mean: " + numberMean + ".");
        scan.close();
    } {
        
    }
}
