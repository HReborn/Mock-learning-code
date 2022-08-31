package com.loiane.cursojavabasico.aula36.Exercicios;
import java.util.Scanner;

public class testeAgenda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        
        System.out.println("Bem vindo! Esse programa criará uma agenda com contatos para você. Insira as informações necessárias abaixo.");
        
        System.out.println("Insira abaixo o nome desejado da agenda.");
        String nomeAgenda = scan.next();
        agenda.setNome(nomeAgenda);

        System.out.println("Insira abaixo quantos contatos deseja adicionar.");
        int numContatos = scan.nextInt();
        Contato[] contatos = new Contato[numContatos];

        for (int i = 0; i < numContatos; i++) {
            Contato contato = new Contato(); // objeto descartável para anexação no array
            System.out.println("Digite abaixo qual o nome do contato. ");
            String nomeContato = scan.next();
            System.out.println("Digite abaixo qual o telefone do contato no formato: +55/81/99999-9999 ");
            String telefoneContato = scan.next();
            System.out.println("Digite abaixo qual o email do contato. ");
            String emailContato = scan.next();

            contato.setTelefone(telefoneContato);
            contato.setNome(nomeContato);
            contato.setEmail(emailContato);
            contatos[i] = contato;
        }
        agenda.setContatos(contatos);
        agenda.mostrarNomeTodosContatos();
        agenda.mostrarInfoContatos();

        scan.close();
    }
}
