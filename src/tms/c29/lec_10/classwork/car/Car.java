package tms.c29.lec_10.classwork.car;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
            "name='" + name + '\'' +
            '}';
    }
}
