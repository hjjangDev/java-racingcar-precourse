package racingcar.domin.car;

import util.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        ValidationUtil.checkDuplicateCar(cars, car);
        cars.add(car);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public void setCars(String[] names) {
        for (String name : names) {
            this.addCar(new Car(name));
        }
    }

}
