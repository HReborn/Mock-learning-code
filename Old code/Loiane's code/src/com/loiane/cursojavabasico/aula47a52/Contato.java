package com.loiane.cursojavabasico.aula47a52;

public class Contato {
    private String nome;
    private String telefone;
    private int identificador;
    private static int contagem = 0;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getIdentificador() {
        return this.identificador;
    }

    public Contato() {
    }
    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.identificador = contador();
    }
    private static int contador() {
        return contagem++;
    }

    @Override
    public String toString() {
        return "\n" + 
            " Nome: " + getNome() + "\n" +
            " Telefone: " + getTelefone() + "\n" +
            " Identificador: " + getIdentificador();
    }

}
