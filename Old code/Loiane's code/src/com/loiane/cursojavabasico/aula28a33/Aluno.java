package com.loiane.cursojavabasico.aula28a33;

public class Aluno {
    private String nomeCompleto = "Breno Felipe Amorim Gomes";
    private String matricula = "2017.1EMRC0043";
    private String curso = "Engenharia mecânica";
    private int periodo = 3;
    private String[] disciplinas = {"Física I", "Estática", "Cálculo II"};
    private double[] notas = {8.5, 3.4, 7.0};

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getPeriodo() {
        return this.periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    public String[] getDisciplinas() {
        return this.disciplinas;
    }
    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    public double[] getNotas() {
        return this.notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public Aluno() {
    }

    public Aluno(String nomeCompleto, String matricula, String curso, int periodo, String[] disciplinas, double[] notas) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.curso = curso;
        this.periodo = periodo;
        this.disciplinas = disciplinas;
        this.notas = notas;
    }

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
