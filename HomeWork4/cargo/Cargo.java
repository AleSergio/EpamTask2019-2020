package HomeWork4.cargo;

import HomeWork4.transportation.Transportation;

public class Cargo {
    private Long id;
    private String name;
    private int weight;
    private CargoType cargoType;
    private Transportation[] transportations;
    private static Long uniqueID = 1L;

    public Cargo() {
        setId(uniqueID);
        uniqueID++;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public Transportation[] getTransportations() {
        return transportations;
    }

    public void setTransportations(Transportation[] transportations) {
        this.transportations = transportations;
    }
}