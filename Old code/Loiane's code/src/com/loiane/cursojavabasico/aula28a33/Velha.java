package com.loiane.cursojavabasico.aula28a33;
import java.util.Scanner;

public class Velha {

    private Scanner scan;
    private String winner;
    private String[][] coordYX;
    private String markerX;
    private String markerO;

    public Velha() {
        this("x", "o");
    }

    public Velha(String markerX, String markerO) {
        this.markerX = markerX;
        this.markerO = markerO;
        this.scan = new Scanner(System.in);
        this.coordYX = new String[3][3];
        this.blankFill();
        this.winner = " ";
    }

    public String getWinner() {
        return this.winner;
    }
    public void setWinner(String winner) {
        this.winner = winner;
    }
    public String getMarkerX() {
        return this.markerX;
    }
    public void setMarkerX(String markerX) {
        this.markerX = markerX;
    }
    public String getMarkerO() {
        return this.markerO;
    }
    public void setMarkerO(String markerO) {
        this.markerO = markerO;
    }

    private void blankFill() {
        // this will fill all the 9 spaces with a blank space to make it printable
        for (int i = 0; i < this.coordYX.length; ++i) {
            for (int j = 0; j < this.coordYX.length; ++j) {
                this.coordYX[i][j] = " ";
            }
        }
        this.winner = " ";
    }

    private void printWholeGrid() {
        // print first line
        System.out.println(this.coordYX[0][0] + "|" + this.coordYX[0][1] + "|" + this.coordYX[0][2]);
        //print second line
        System.out.println("-----");
        System.out.println(this.coordYX[1][0] + "|" + this.coordYX[1][1] + "|" + this.coordYX[1][2]);
        System.out.println("-----");
        // print third line
        System.out.println(this.coordYX[2][0] + "|" + this.coordYX[2][1] + "|" + coordYX[2][2]);
    }

    private void verifyWin() {
        // only x
        boolean diag1X = this.coordYX[0][0] == this.markerX && this.coordYX[1][1] == this.markerX && this.coordYX[2][2] == this.markerX;
        boolean diag2X = this.coordYX[0][2] == this.markerX && this.coordYX[1][1] == this.markerX && this.coordYX[2][0] == this.markerX;
        boolean line1X = this.coordYX[0][0] == this.markerX && this.coordYX[0][1] == this.markerX && this.coordYX[0][2] == this.markerX;
        boolean line2X = this.coordYX[1][0] == this.markerX && this.coordYX[1][1] == this.markerX && this.coordYX[1][2] == this.markerX;
        boolean line3X = this.coordYX[2][0] == this.markerX && this.coordYX[2][1] == this.markerX && this.coordYX[2][2] == this.markerX;
        boolean column1X = this.coordYX[0][0] == this.markerX && this.coordYX[1][0] == this.markerX && this.coordYX[2][0] == this.markerX;
        boolean column2X = this.coordYX[0][1] == this.markerX && this.coordYX[1][1] == this.markerX && this.coordYX[2][1] == this.markerX;
        boolean column3X = this.coordYX[0][2] == this.markerX && this.coordYX[1][2] == this.markerX && this.coordYX[2][2] == this.markerX;
        // only o
        boolean diag1O = this.coordYX[0][0] == this.markerO && this.coordYX[1][1] == this.markerO && this.coordYX[2][2] == this.markerO;
        boolean diag2O = this.coordYX[0][2] == this.markerO && this.coordYX[1][1] == this.markerO && this.coordYX[2][0] == this.markerO;
        boolean line1O = this.coordYX[0][0] == this.markerO && this.coordYX[0][1] == this.markerO && this.coordYX[0][2] == this.markerO;
        boolean line2O = this.coordYX[1][0] == this.markerO && this.coordYX[1][1] == this.markerO && this.coordYX[1][2] == this.markerO;
        boolean line3O = this.coordYX[2][0] == this.markerO && this.coordYX[2][1] == this.markerO && this.coordYX[2][2] == this.markerO;
        boolean column1O = this.coordYX[0][0] == this.markerO && this.coordYX[1][0] == this.markerO && this.coordYX[2][0] == this.markerO;
        boolean column2O = this.coordYX[0][1] == this.markerO && this.coordYX[1][1] == this.markerO && this.coordYX[2][1] == this.markerO;
        boolean column3O = this.coordYX[0][2] == this.markerO && this.coordYX[1][2] == this.markerO && this.coordYX[2][2] == this.markerO;

        if (diag1X || diag2X || line1X || line2X || line3X || column1X || column2X || column3X) {
            this.winner = "x";
        } else if (diag1O || diag2O || line1O || line2O || line3O || column1O || column2O || column3O) {
            this.winner = "o";
        } else {
            this.winner = " ";
        }
    }

    public void comecarJogo() {
        System.out.println("Deseja começar o jogo da velha? y/n");
        String comecar;
        while (true) {
            comecar = scan.nextLine();
            if ("y".equals(comecar)) {
                this.jogar();
            } else if ("n".equals(comecar)) { 
                System.out.println("Obrigado por jogar o nosso jogo. Volte sempre.");
                break;
            }
            System.out.println("Deseja jogar outra partida?");
            blankFill();
        }
    }

    private void jogar() {
        System.out.println("Use as seguintes keywords para as linhas: top, middle, bottom.");
        System.out.println("Use as seguintes keywords para as colulas: left, middle, right.");
        System.out.println("Formatação do input. Ex: top bottom. Ex: middle middle.");
        int i = 0;
        String marker;
        while (" ".equals(this.winner)) {
            if (i%2 == 0) {
                marker = this.markerX;
                System.out.println("Insira abaixo onde que quer colocar o marcador X.");
            } else
                marker = this.markerO;
                System.out.println("Insira abaixo onde que quer colocar o marcador O.");
            
            String yPosition = scan.next();
            String xPosition = scan.next();
            this.placeMarker(yPosition, xPosition, marker);
            this.printWholeGrid();
            this.verifyWin();
            if ("x".equals(this.winner)) {
                System.out.println("Parabéns player 1 do marcador " + this.markerX + "!!!");                
            } else if ("o".equals(this.winner)) {
                System.out.println("Parabéns player 2 do marcador " + this.markerO + "!!!");
            }
            i++;
        }
    }

    private void placeMarker(String yPosition, String xPosition, String marker) {
        int y = 0;
        int x = 0;
        if ("top".equals(yPosition)) {
            y = 0;
        } else if ("middle".equals(yPosition)) {
            y = 1;
        } else if ("bottom".equals(yPosition)) {
            y = 2;
        }

        if ("left".equals(xPosition)) {
            x = 0;
        } else if ("middle".equals(xPosition)) {
            x = 1;
        } else if ("right".equals(xPosition)) {
            x = 2;
        }
        this.coordYX[y][x] = marker;
    }
}
