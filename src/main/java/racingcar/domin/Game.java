package racingcar.domin;

import racingcar.domin.car.Cars;
import racingcar.view.InputView;

public class Game {

    private Cars cars;
    private Racing racing;
    private int racingTime;

    public void start() {
        prepareRacing();
        startRacing();
        finishRacing();
    }

    private void prepareRacing() {
        InputView view = new InputView();
        String[] carNames = view.inputCarNames();
        cars = new Cars();
        cars.setCars(carNames);
        racingTime = view.inputNumberOfGame();
    }

    private void startRacing() {
        racing = new Racing();
        System.out.println("실행 결과");
        for (int i = 0; i < racingTime; i++) {
            racing.movePosition(cars);
        }
    }

    private void finishRacing() {
        racing.judgeWinner(cars);
        racing.printWinner();
    }
}
