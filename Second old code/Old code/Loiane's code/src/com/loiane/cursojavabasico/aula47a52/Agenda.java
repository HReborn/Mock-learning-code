package com.loiane.cursojavabasico.aula47a52;

public class Agenda {
    private String nomeAgenda;
    private Contato[] contatos = new Contato[4]; // exercício teste. valor pequeno.
    // se mudar o número 4, tem que mudar no método contato também

    public String getNomeAgenda() {
        return this.nomeAgenda;
    }
    public void setNomeAgenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }
    public Contato[] getContatos() {
        return this.contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }

    public Agenda() {
    }
    public Agenda(String nomeAgenda) {
        this.nomeAgenda = nomeAgenda;
    }

    public void adicionarContato(String nome, String telefone){
        Contato contato = new Contato(nome, telefone);
        try {
            if (contato.getIdentificador() > 3) {
                throw new AgendaCheiaException();
            }
            contatos[contato.getIdentificador()] = contato;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void consultarContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                System.out.println(contato.toString());
                return;
            }
        }
        // Se não achar o contato, printa dizendo q não acha
        try {
            throw new ContatoNaoExisteException(nome);
        } catch (ContatoNaoExisteException e) {
            System.out.println(e);
        }
        
    }
}


