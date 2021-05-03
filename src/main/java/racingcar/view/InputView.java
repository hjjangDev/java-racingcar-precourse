package racingcar.view;

import util.ValidationUtil;

import java.util.Scanner;

public class InputView {

    private final String CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,) 기준으로 구분)";
    private final String RACING_TIME_MESSAGE = "시도할 회수는 몇회인가요?";

    private String getUserInputValue(String message) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);

        return ValidationUtil.checkInputString(sc.nextLine());
    }

    public String[] inputCarNames() {
        String[] names = getUserInputValue(CAR_NAME_MESSAGE).split(",");
        ValidationUtil.checkNumberOfCar(names);

        return names;
    }

    public int inputNumberOfGame() {
        String racingTime = getUserInputValue(RACING_TIME_MESSAGE);
        ValidationUtil.checkNumberOfGame(racingTime);

        return Integer.parseInt(racingTime);
    }

}
