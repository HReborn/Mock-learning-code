package com.loiane.cursojavabasico.aula36a43.Q2Receita;

public class PessoaFisica extends Contribuintes {


    public PessoaFisica() {
    }
    public PessoaFisica(String nome, double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public void CalcularImposto() {
        // if (super.getRendaBruta() <= 1400 ) {
        //     super.setImposto(0);
        // } else if (super.getRendaBruta() > 1400.01 && super.getRendaBruta() <= 2100) {
        //     super.setImposto(100);
        // } else if (super.getRendaBruta() > 2100.01 && super.getRendaBruta() <= 2800) {
        //     super.setImposto(270);
        // } else if (super.getRendaBruta() > 2800.01 && super.getRendaBruta() <= 3600 ) {
        //     super.setImposto(500);
        // } else if (super.getRendaBruta() > 3600.01) {
        //     super.setImposto(700);
        // }
        // super.mostrarImposto();



        if (super.getRendaBruta() <= 1400 ) {
            super.setImposto(0); super.mostrarImposto(); return;
        }
        if (super.getRendaBruta() > 1400.01 && super.getRendaBruta() <= 2100) {
            super.setImposto(100); super.mostrarImposto(); return;
        } 
        if (super.getRendaBruta() > 2100.01 && super.getRendaBruta() <= 2800) {
            super.setImposto(270); super.mostrarImposto(); return;
        } 
        if (super.getRendaBruta() > 2800.01 && super.getRendaBruta() <= 3600 ) {
            super.setImposto(500); super.mostrarImposto(); return;
        } 
        if (super.getRendaBruta() > 3600.01) {
            super.setImposto(700); super.mostrarImposto(); return;
        }
    }
    
}
