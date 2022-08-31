package com.loiane.cursojavabasico.aula36a43.Q2Receita;

public class PessoaJuridica extends Contribuintes {

    public PessoaJuridica() {
    }
    public PessoaJuridica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }
    @Override
    public void CalcularImposto() {
        super.setImposto(super.getRendaBruta()*0.1);
        super.mostrarImposto();
    }
    
}
