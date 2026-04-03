package com.loiane.cursojavabasico.aula12;

// classe scanner que é da api do java
// Scanner scan = new Scanner(System.in);

//String nome = scan.nextLine(); lê tudo a linha inteira
//String primeiroNome = scan.next(); retorna a string
//int idade = scan.nextInt(); retorna um int
//double altura = scan.nextDouble(); retorna um double

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        
         // Aqui está usando o tipo de variável Scanner que foi importada da api do java para criar uma variável de nome scan
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o seu nome completo com 4 nomes.");
        String nome1 = scan.next();
        String nome2 = scan.next(); 
        String nome3 = scan.next();
        String nome4 = scan.next();
        System.out.println("O seu nome completo é: " + nome1 +" "+ nome2 +" "+ nome3 +" "+ nome4+".");
        scan.close();
    }
}
