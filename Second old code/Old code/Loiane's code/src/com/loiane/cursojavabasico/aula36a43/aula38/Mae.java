package com.loiane.cursojavabasico.aula36a43.aula38;

import java.util.Objects;

public class Mae {
    private String nome;
    private int idade;

 

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void TestarAcesso() {
        System.out.println("Acesso da classe mãe");
    }

    public void TestarAcessoMae() {
        System.out.println("objeto filho do tipo filho conseguiu acessar a partir da superclasse.");
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mae)) {
            return false;
        }
        Mae mae = (Mae) o;
        return Objects.equals(nome, mae.nome) && idade == mae.idade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

}
