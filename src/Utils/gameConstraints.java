package Utils;

public interface gameConstraints {

    String TITLE = "F1 Racing";
    int G_WIDTH = 600;
    int G_HEIGHT = 800;
    String PLAYER = "YellowCar.png";
    String GAME_BG = "road.jpeg";

    // CAR
    int CAR_WIDTH = 100;
    int CAR_HEIGHT = 180;

    int DEFAULT_X = (G_WIDTH / 2) - (CAR_WIDTH / 2);
    int DEFAULT_Y = G_HEIGHT - CAR_HEIGHT - 50;

    int LANE_1 = 10;
    int LANE_2 = 300;
    int LANE_3 = 500;
}
