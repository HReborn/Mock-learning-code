package com.loiane.cursojavabasico.aula47a52;

public class Teste {
    public static void main(String[] args) {
        
        Agenda ag = new Agenda("Contatin");

        ag.adicionarContato("Yann", "+55 81 99999-9999");
        ag.adicionarContato("Cristiane", "+55 81 88888-8888");
        ag.adicionarContato("Igor", "+55 81 77777-7777");
        ag.adicionarContato("Leandro", "+55 81 66666-6666");

        ag.consultarContato("yann");
        ag.consultarContato("cristiane");
        ag.consultarContato("igor");
        ag.consultarContato("leandro");

        ag.consultarContato("mãe");

        ag.adicionarContato("Mãe", "+55 81 55555-5555");
    }
}