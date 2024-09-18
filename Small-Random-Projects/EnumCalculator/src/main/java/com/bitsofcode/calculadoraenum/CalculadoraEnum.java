package com.bitsofcode.calculadoraenum;

public enum CalculadoraEnum {
    SOMAR("+") {
        @Override
        double executarOperacao(double x, double y) {
            return x+y;
        }
    }, 

    SUBTRAIR("-") {
        @Override
        double executarOperacao(double x, double y) {
            return x-y;
        }
    }, 

    MULTIPLICAR("*") {
        @Override
        double executarOperacao(double x, double y) {
            return x*y;
        }
    }, 

    DIVIDIR("/") {
        @Override
        double executarOperacao(double x, double y) {
            return x/y;
        }
    };

    private String operacao;

    String getOperacao() {
        return operacao;
    }

    CalculadoraEnum(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        return this.operacao;
    }

    abstract double executarOperacao(double x, double y);
}