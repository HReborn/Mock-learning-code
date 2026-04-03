package com.loiane.cursojavabasico.aula36a43.Q3zoo;

public class Zoologico {
    public static void main(String[] args) {
        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        Peixe tubarao = new Peixe("Tubarão", 300, 1.5);
        Mamifero urso = new Mamifero("Mel", "Urso-do-canadá", 180, "Vermelho", 0.5); 
        Object[] zoologico = {camelo, tubarao, urso};
        mostrarZoo(zoologico);
    }
    public static void mostrarZoo(Object[] zoologico) {
        System.out.println();
        System.out.println("Zoo");
        System.out.println("--------------------------------------");
        for (Object animal : zoologico) {
            System.out.println(animal.toString());
            System.out.println("--------------------------------------");
        }
    }
}
