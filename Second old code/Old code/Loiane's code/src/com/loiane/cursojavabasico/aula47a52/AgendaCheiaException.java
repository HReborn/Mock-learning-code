package com.loiane.cursojavabasico.aula47a52;

public class AgendaCheiaException extends Exception {
    @Override
    public String toString() {
        return "Agenda cheia. Delete algum contato ou aumente o limite da agenda.";
    }
}
