package org.example;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int rowcount = 21;
        int colcount = 19;
        int tileSize = 32;
        int boardWidth =colcount * tileSize;
        int boardHeight = rowcount * tileSize;

        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        PacMan  pacmanGame = new PacMan();
        frame.add(pacmanGame);
        frame.pack();
        pacmanGame.requestFocus();
        frame.setVisible(true);





    }
}