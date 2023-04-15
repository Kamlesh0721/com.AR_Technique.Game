package SourceFile;

import Utils.gameConstraints;

import javax.swing.*;
import java.awt.*;

public class f1RacingGame extends JPanel implements gameConstraints {
    private JLabel playerCar;

    f1RacingGame() throws Exception {
        super.setSize(CAR_WIDTH, CAR_HEIGHT);

        // Add Player Car
        addPlayer();
        super.setBackground(Color.DARK_GRAY);
        super.setLocation(300, 300);


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

}
