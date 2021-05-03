package racingcar.domain.car;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domin.car.Position;
import racingcar.exception.InvalidCarException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionTest {

    Position position = new Position();

    @Test
    @DisplayName("Position_움직이기_실패_범위_초과")
    void position_fail_move_forward() {
        position.defaultDistance = 0;
        position.forwardDistance = 2;

        assertThatThrownBy(
                () -> position.setPosition(3)
        ).isInstanceOf(InvalidCarException.class);
    }

    @Test
    @DisplayName("Position_전진")
    void position_success_move_forward() {

        position.defaultDistance = 0;
        position.forwardDistance = 5;

        position.moveForward();
        assertEquals(position.getValue(), 5);

        position.moveForward();
        assertEquals(position.getValue(), 10);
    }

}
