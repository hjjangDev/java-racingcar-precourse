package racingcar.domin;


import racingcar.domin.car.Car;
import racingcar.domin.car.Cars;

import java.util.Collections;
import java.util.Comparator;
import java.util.StringJoiner;

public class Racing {

    public Cars frontRunners = new Cars();
    public int maxPosition;

    public void movePosition(Cars cars) {
        for (Car car : cars.getCars()) {
            car.move();
        }
        System.out.println();
    }

    public void judgeWinner(Cars cars) {
        maxPosition = Collections.max(cars.getCars(), Comparator.comparing(s -> s.getPosition().getValue())).getPosition().getValue();
        for (Car car : cars.getCars()) {
            setFrontRunners(car);
        }
    }

    private void setFrontRunners(Car car) {
        if (car.getPosition().getValue() == maxPosition) {
            frontRunners.addCar(car);
        }
    }

    public void printWinner() {
        StringJoiner winners = new StringJoiner(",");
        for (Car car : frontRunners.getCars()) {
            winners.add(car.getName().getValue());
        }
        System.out.println(winners + "가 최종 우승했습니다.");
    }
}
