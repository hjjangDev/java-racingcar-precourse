package racingcar.domin.car;

import util.ValidationUtil;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class Position {
    private AtomicInteger position = new AtomicInteger();

    public static int defaultDistance = 0;
    public static int forwardDistance = 1;

    public Position() {
        this.position = new AtomicInteger();
    }

    public Position(int position) {
        this.position.set(position);
    }

    public int getValue() {
        return position.get();
    }

    public boolean isMove() {
        return ThreadLocalRandom.current().nextInt(0, 10) > 3;
    }

    public void setPosition(int position) {
        ValidationUtil.validatePosition(position);
        this.position.accumulateAndGet(position, (x, y) -> (x + y));
    }

    public void moveForward() {
        setPosition(forwardDistance);
    }
}
