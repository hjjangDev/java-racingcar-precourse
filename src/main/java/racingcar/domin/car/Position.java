package racingcar.domin.car;

import util.ValidationUtil;

import java.util.concurrent.ThreadLocalRandom;

public class Position {
    private int position;

    public static int defaultDistance = 0;
    public static int forwardDistance = 1;

    public Position() {
        this.position = 0;
    }

    public Position(int position) {
        this.position = position;
    }

    public int getValue() {
        return position;
    }

    public boolean isMove() {
        return ThreadLocalRandom.current().nextInt(0, 10) > 3;
    }

    public void setPosition(int position) {
        ValidationUtil.validatePosition(position);
        this.position += position;
    }

    public void moveForward() {
        setPosition(forwardDistance);
    }
}
