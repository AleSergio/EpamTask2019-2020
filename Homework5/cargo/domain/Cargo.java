package Homework5.cargo.domain;

import java.util.Arrays;

public class Cargo extends Common {

    private int weight;
    private CargoType cargoType;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CargoType getCargoType() {
        return cargoType;
    }

    public void setCargoType(CargoType cargoType) {
        this.cargoType = cargoType;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", cargoType=" + cargoType +
                " , transportations=" + Arrays.toString(transportations) +
                '}';
    }
}