package com.loiane.cursojavabasico.aula36.Exercicios;

public class Agenda {
    private String nome;
    private Contato[] contatos;

    public Contato[] getContatos() {
        return this.contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] mostrarNomeTodosContatos() {
        System.out.println();
        System.out.println("Todos os contatos adicionados da agenda são:");
        System.out.println();
        String[] todosContatos = new String[this.contatos.length];
        for (int i = 0; i < this.contatos.length; i++) {
            if (this.contatos[i] != null && this.contatos != null) {
                todosContatos[i] = this.contatos[i].getNome();
                System.out.println(todosContatos[i]);
            }
        }
        return todosContatos;
    }

    public void mostrarInfoContatos() {
        for (Contato contato : contatos) {
            System.out.println();
            System.out.println(contato.getNome());
            System.out.println(contato.getTelefone());
            System.out.println(contato.getEmail());
        }
    }
}
