package racingcar.domin.car;

public class Car {

    private Name name;
    private Position position;

    private StringBuilder statusSB = new StringBuilder();

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Name getName() {
        return this.name;
    }

    public Position getPosition() {
        return this.position;
    }

    public void move() {
        if (position.isMove()) {
            position.moveForward();
        }
        printCarStatus();
    }

    private void printCarStatus() {
        statusSB.setLength(0);

        statusSB.append(name.getValue() + " : ");
        for (int i = 0; i < position.getValue(); i++) {
            statusSB.append("-");
        }
        System.out.println(statusSB);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return name.getValue().equals(((Car) o).name.getValue());
    }

}
