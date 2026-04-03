package com.loiane.cursojavabasico.aula25a27;

public class Lampada {
    int voltagem = 20; // volts
    int amperagem = 2; // amperes
    int tempoVidaUtil = 5; // anos

    static void Switch(String estadoLampada) {
        switch (estadoLampada) {
            case "on": System.out.println("Lâmpada ligada."); break;
            case "off": System.out.println("Lâmpada desligada."); break;
        }
    }
}
