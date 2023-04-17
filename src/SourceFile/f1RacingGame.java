package SourceFile;

import Utils.gameConstraints;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class f1RacingGame extends JPanel implements gameConstraints {
    private JLabel playerCar;


    f1RacingGame() throws Exception {
        super.setSize(CAR_WIDTH, CAR_HEIGHT);


        // Add Player Car
        addPlayer();
        super.setLocation(DEFAULT_X, DEFAULT_Y);

        setFocusable(true);
        controller();

    }


    private void addPlayer() {
        playerCar = new JLabel();
        ImageIcon carIcon = new ImageIcon(getClass().getResource(PLAYER));
        Image carImg = carIcon.getImage();
        Image carImgScale = carImg.getScaledInstance(CAR_WIDTH, CAR_HEIGHT, Image.SCALE_SMOOTH);
        ImageIcon scaledImgIcon = new ImageIcon(carImgScale);
        playerCar.setIcon(scaledImgIcon);
        super.add(playerCar);
    }

    private void controller() {
        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_RIGHT) {
                    System.out.println("Right Key Pressed");
                    setLocation(LANE_3, getY());
                }
                if (key == KeyEvent.VK_LEFT) {
                    System.out.println("Left Key Pressed");
                    setLocation(LANE_1, getY());
                }
            }

        };
        this.addKeyListener(listener);
    }

}
