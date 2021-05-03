package racingcar.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domin.car.Cars;
import racingcar.exception.InvalidCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    @DisplayName("Car_생성_실패_이름_5자초과")
    void car_fail_name_size_over() {
        assertThatThrownBy(
                () -> new Cars().setCars(new String[]{"abcdefg", "h", "i"})
        ).isInstanceOf(InvalidCarException.class);
    }

    @Test
    @DisplayName("Car_생성_실패_이름_null")
    void car_fail_name_blank() {
        assertThatThrownBy(
                () -> new Cars().setCars(new String[]{"a", null, "c", "d"})
        ).isInstanceOf(InvalidCarException.class);
    }

    @Test
    @DisplayName("Cars_add_실패_중복_Car")
    void cars_fail_duplicate_name() {
        assertThatThrownBy(
                () -> new Cars().setCars(new String[]{"a", "a", "c", "d"})
        ).isInstanceOf(InvalidCarException.class);
    }

    @Test
    @DisplayName("Cars_생성_성공")
    void user_ball_success_list() {
        Cars cars = new Cars();
        cars.setCars(new String[]{"a", "b", "c", "d", "e"});

        assertEquals(cars.getCars().size(), 5);
    }

}
