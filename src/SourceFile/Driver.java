package SourceFile;

import Utils.gameConstraints;

import javax.swing.*;

public class Driver extends JFrame implements gameConstraints {
    Driver() throws Exception {
        setTitle(TITLE);
        setSize(G_WIDTH, G_HEIGHT);
        setLayout(null);

        f1RacingGame board = new f1RacingGame();
        add(board);

        setResizable(false);
        setLocationRelativeTo(null); // frame will open in centre of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        try {
            Driver game = new Driver();
        } catch (Exception e) {
            System.out.println("Unable to Load Game\nRestart\n" + e);
        }
    }
}
