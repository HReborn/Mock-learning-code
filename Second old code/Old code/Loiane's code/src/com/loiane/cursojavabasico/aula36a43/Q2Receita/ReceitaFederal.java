package com.loiane.cursojavabasico.aula36a43.Q2Receita;

public class ReceitaFederal {
    public static void main(String[] args) {
        
        // criar os contribuintes
        PessoaFisica pf1 = new PessoaFisica("Jão", 700);
        PessoaFisica pf2 = new PessoaFisica("Júnio", 4000);
        PessoaFisica pf3 = new PessoaFisica("Malu", 2500);
        PessoaJuridica pj1 = new PessoaJuridica("Samsung", 23534534);
        PessoaJuridica pj2 = new PessoaJuridica("Anatel", 235345);
        PessoaJuridica pj3 = new PessoaJuridica("Avessa", 23534);
        pf1.CalcularImposto();
        pf2.CalcularImposto();
        pf3.CalcularImposto();
        pj1.CalcularImposto();
        pj2.CalcularImposto();
        pj3.CalcularImposto();

    }
}
