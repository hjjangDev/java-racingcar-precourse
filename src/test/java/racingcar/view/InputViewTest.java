package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.exception.InvalidUserInputException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InputViewTest {

    InputView inputView = new InputView();

    @Test
    @DisplayName("자동차이름_입력_실패_1대만입력")
    void input_fail_car_names() {
        String input = "a";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThatThrownBy(
                () -> inputView.inputCarNames()
        ).isInstanceOf(InvalidUserInputException.class);
    }

    @Test
    @DisplayName("자동차이름_입력_성공")
    void input_success_car_names() {
        String input = "a,b,c";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(inputView.inputCarNames().length, 3);
    }

    @Test
    @DisplayName("게임횟수_입력_실패_문자열입력")
    void input_fail_number_of_game() {
        String input = "one";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertThatThrownBy(
                () -> inputView.inputNumberOfGame()
        ).isInstanceOf(InvalidUserInputException.class);
    }

    @Test
    @DisplayName("게임횟수_입력_성공")
    void input_success_number_of_game() {
        String input = "5";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(inputView.inputNumberOfGame(), 5);
    }

}
