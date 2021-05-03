package racingcar.domin.car;

import util.ValidationUtil;

public class Name {
    private String name;

    public Name(String name) {
        validateName(name);
        this.name = name;
    }

    public String getValue() {
        return name;
    }

    private void validateName(String name) {
        ValidationUtil.checkBlank(name);
        ValidationUtil.checkSize(name);
    }

}
