package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domin.Racing;
import racingcar.domin.car.Car;
import racingcar.domin.car.Cars;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingCarTest {
    Cars cars = new Cars();

    Racing racing = new Racing();

    @Test
    @DisplayName("선두주자_판단_우승자1명")
    void racing_one_frontRunner() {
        Car a = new Car("a", 0);
        Car b = new Car("b", 2);
        Car c = new Car("c", 1);
        cars.addCar(a);
        cars.addCar(b);
        cars.addCar(c);

        racing.judgeWinner(cars);

        //"b"가 우승일때
        assertEquals(racing.maxPosition, 2);
        assertEquals(racing.frontRunners.getCars().size(), 1);
        assertEquals(racing.frontRunners.getCars().get(0), b);
        assertEquals(racing.frontRunners.getCars().get(0).getName(), b.getName());
        assertEquals(racing.frontRunners.getCars().get(0).getPosition(), b.getPosition());
    }

    @Test
    @DisplayName("선두주자_판단_우승자2명")
    void racing_tow_frontRunner() {
        Car a = new Car("a", 2);
        Car b = new Car("b", 2);
        Car c = new Car("c", 1);
        cars.addCar(a);
        cars.addCar(b);
        cars.addCar(c);

        racing.judgeWinner(cars);

        //"a","b"가 우승일때
        assertEquals(racing.maxPosition, 2);
        assertEquals(racing.frontRunners.getCars().size(), 2);

    }
}
