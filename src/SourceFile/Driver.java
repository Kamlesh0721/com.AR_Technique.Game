package SourceFile;

import Utils.gameConstraints;

import javax.swing.*;
import java.awt.*;

public class Driver extends JFrame implements gameConstraints {
    private JLabel bgImg;

    Driver() throws Exception {
        setTitle(TITLE);
        setSize(G_WIDTH, G_HEIGHT);
       // setLayout(null);

        // Add Background
        addBG();

        f1RacingGame board = new f1RacingGame();
        bgImg.add(board);

        setResizable(false); // if false we can not resize Frame -> No Maximize and Minimize
        setLocationRelativeTo(null); // frame will open in centre of screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addBG() {
        ImageIcon carIcon = new ImageIcon(getClass().getResource(GAME_BG));
        bgImg = new JLabel("", carIcon, JLabel.CENTER);

        Image carImg = carIcon.getImage();
        Image carImgScale = carImg.getScaledInstance(G_WIDTH, G_HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon scaledImgIcon = new ImageIcon(carImgScale);
        bgImg.setIcon(scaledImgIcon);

        setBounds(0, 0, G_WIDTH, G_HEIGHT);
        add(bgImg);
    }

    public static void main(String[] args) {
        try {
            Driver game = new Driver();
        } catch (Exception e) {
            System.out.println("Unable to Load Game\nRestart\n" + e);
        }
    }
}
