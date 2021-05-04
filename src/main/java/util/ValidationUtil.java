package util;

import org.junit.platform.commons.util.StringUtils;
import racingcar.domin.car.Car;
import racingcar.domin.car.Position;
import racingcar.exception.InvalidCarException;
import racingcar.exception.InvalidUserInputException;

import java.util.List;

public class ValidationUtil {
    private final static String CAR_DUPLICATE_MESSAGE = "중복된 자동차가 있습니다.";
    private final static String CAR_DISTANCE_MESSAGE = "위치가 올바르지 않습니다.";
    private final static String CAR_NAME_BLANK_MESSAGE = "자동차 이름은 공백일수 없습니다.";
    private final static String CAR_NAME_LENGTH_MESSAGE = "자동차 이름은 5자 이하로 가능합니다.";

    private final static String INPUT_CAR_NUMBER_MESSAGE = "2개 이상의 자동차를 입력해야 시작 가능합니다.";
    private final static String INPUT_GAME_NUMBER_MESSAGE = "게임은 1회 이상을 입력해야 시작 가능합니다.";
    private final static String INPUT_NUMBER_MESSAGE = "숫자만 입력 가능합니다.";
    private final static String INPUT_BLANK_MESSAGE = "공백은 입력이 불가합니다.";


    public static void checkDuplicateCar(List<Car> cars, Car car) {
        if (cars.contains(car)) {
            throw new InvalidCarException(CAR_DUPLICATE_MESSAGE);
        }
    }

    public static void validatePosition(int position) {
        if (position < Position.defaultDistance || Position.forwardDistance < position) {
            throw new InvalidCarException(CAR_DISTANCE_MESSAGE);
        }
    }

    public static void checkBlank(String name) {
        if (name == null || StringUtils.isBlank(name.trim())) {
            throw new InvalidCarException(CAR_NAME_BLANK_MESSAGE);
        }
    }

    public static void checkSize(String name) {
        if (name.length() > 5) {
            throw new InvalidCarException(CAR_NAME_LENGTH_MESSAGE);
        }
    }

    public static void checkNumberOfCar(String[] names) {
        if (names.length <= 1) {
            throw new InvalidUserInputException(INPUT_CAR_NUMBER_MESSAGE);
        }
    }

    public static void checkNumberOfGame(String racingTime) {
        if (checkNumberValidation(racingTime) < 1) {
            throw new InvalidUserInputException(INPUT_GAME_NUMBER_MESSAGE);
        }
    }

    private static int checkNumberValidation(String StrNumber) {
        if (!Util.pattern.matcher(StrNumber).find()) {
            throw new InvalidUserInputException(INPUT_NUMBER_MESSAGE);
        }
        return Integer.parseInt(StrNumber);
    }

    public static String checkInputString(String input) {
        if (StringUtils.isBlank(input)) {
            throw new InvalidUserInputException(INPUT_BLANK_MESSAGE);
        }
        return input;
    }
}
