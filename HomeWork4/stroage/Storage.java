package HomeWork4.stroage;

import HomeWork4.cargo.Cargo;
import HomeWork4.carrier.Carrier;

public class Storage {
    public static Cargo[] cargoStorage = new Cargo[3];
    public static Carrier[] carrierStorage = new Carrier[3];
    static int carrierCount = 0;
    static int cargoCount = 0;


    public static void inputObject(Cargo cargo) {

        if (cargoCount >= cargoStorage.length) {
            Cargo[] cargoStorageC = new Cargo[cargoStorage.length];
            System.arraycopy(cargoStorage, 0, cargoStorageC, 0, cargoStorage.length);
        }
        cargoStorage[cargoCount] = cargo;
        cargoCount++;
    }

    public static void outputCargo() {
        for (int i = 0; i < cargoCount; i++) {
            System.out.println("Cargo Name: " + cargoStorage[i].getName());
            System.out.println("Cargo ID: " + cargoStorage[i].getId());
        }
    }

    public static void inputObject(Carrier carrier) {

        if (carrierCount >= carrierStorage.length) {
            Carrier[] carrierStorageC = new Carrier[carrierStorage.length];
            System.arraycopy(carrierStorage, 0, carrierStorageC, 0, carrierStorage.length);
        }
        carrierStorage[carrierCount] = carrier;
        carrierCount++;
    }

    public static void outputCarrier(){
        for (int i = 0; i < carrierCount; i++) {
            System.out.println("Company Name: " + carrierStorage[i].getName());
            System.out.println("Company ID: " + carrierStorage[i].getId());
        }
    }
}
