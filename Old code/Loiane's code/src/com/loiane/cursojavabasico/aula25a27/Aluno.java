package com.loiane.cursojavabasico.aula25a27;

public class Aluno {
    static String nomeCompleto = "Breno Felipe Amorim Gomes";
    static String matricula = "2017.1EMRC0043";
    static String curso = "Engenharia mecânica";
    static int periodo = 3;
    static String[] disciplinas = {"Física I", "Estática", "Cálculo II"};
    static double[] notas = {8.5, 3.4, 7.0};

    public Aluno() {
        System.out.println("o bagulho instanciou");
    }

    // testando sobre os construtores abaixo. apague.

    public Aluno(int numVida, int numClass, int numCabeca) {
        System.out.println("Recebeu os três e mostrou:");
        System.out.println(numVida);
        System.out.println(numClass);
        System.out.println(numCabeca);
    }

    static public void testar(int numVida, int numClass, int numCabeca) {
        System.out.println("Recebeu os três e mostrou:");
        System.out.println(numVida);
        System.out.println(numClass);
        System.out.println(numCabeca);
    }

    // testando sobre os construtores acima. apague.

    public void consultarAprovacao(String id) {
        
        System.out.println();
        System.out.println("As informações do aluno " + nomeCompleto + " são:");
        System.out.println("Curso: " + curso);
        System.out.println("Período: " + periodo);

        if (id == matricula) {
            for (int i = 0; i < 3; i++) {
                String aprovacao = "";
                if (notas[i] >= 7) {
                    aprovacao = "Aprovado";
                } else {
                    aprovacao = "Reprovado";
                }
                System.out.println();
                System.out.println("Matéria: " + disciplinas[i]);
                System.out.println("Nota: " + notas[i]);
                System.out.println("Resultado: " + aprovacao);
                System.out.println();
            }
        }
    }
}
