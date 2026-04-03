package com.loiane.cursojavabasico.aula36;

public class Contato {
    private Nome nome;
    private String endereco;
    private Numero[] numeros;
    private String referencia;

    public Nome getNome() {
        return this.nome;
    }
    public void setNome(Nome nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getReferencia() {
        return this.referencia;
    }
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    public Numero[] getNumeros() {
        return this.numeros;
    }
    public void setNumeros(Numero[] numeros) {
        this.numeros = numeros;
    }

}