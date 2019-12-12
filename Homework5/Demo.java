package Homework5;

import Homework5.cargo.domain.Cargo;
import Homework5.cargo.domain.CargoType;
import Homework5.carrier.Carrier;
import Homework5.carrier.CarrierType;

public class Demo {
    public static void main(String[] args) {
        Cargo cargo = new Cargo();
        cargo.setName("apple");
        cargo.setWeight(2);
        cargo.setCargoType(CargoType.FOOD);
        Storage.addCargo(cargo);

        cargo = new Cargo();
        cargo.setName("TV");
        cargo.setWeight(6);
        cargo.setCargoType(CargoType.ELECTRONICS);
        Storage.addCargo(cargo);

        Carrier carrier = new Carrier();
        carrier.setName("carrier1");
        carrier.setAddress("RUSSIA");
        carrier.setCarrierType(CarrierType.SHIP);
        Storage.addCarrier(carrier);

        carrier = new Carrier();
        carrier.setName("carrier2");
        carrier.setAddress("USA");
        carrier.setCarrierType(CarrierType.CAR);
        Storage.addCarrier(carrier);

        OutputStorage.printAllCargos();
        OutputStorage.printAllCarriers();
        OutputStorage.printById(3);
        OutputStorage.printByName("apple");
        OutputStorage.printByWeight(6);
        OutputStorage.printByAddress("RUSSIA");
        OutputStorage.printByCargoType(CargoType.FOOD);
        OutputStorage.printByCarrierType(CarrierType.SHIP);
    }
}
