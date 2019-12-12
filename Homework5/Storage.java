package Homework5;

import Homework5.cargo.domain.Cargo;
import Homework5.carrier.Carrier;

public class Storage {
    private static final int ARRAY_CAPACITY = 2;

    protected static Cargo[] cargos = new Cargo[ARRAY_CAPACITY];
    protected static int cargoIndex = 0;
    protected static Carrier[] carriers = new Carrier[ARRAY_CAPACITY];
    protected static int carrierIndex = 0;

    public static void addCargo(Cargo cargo) {
        cargo.setId(IdGenerator.generateId());
        cargos[cargoIndex] = cargo;
        cargoIndex++;

        if (cargoIndex % (ARRAY_CAPACITY - 1) == 0) {
            Cargo[] newCargos = new Cargo[cargoIndex + ARRAY_CAPACITY];
            copyCargoArray(cargos, newCargos);
            cargos = newCargos;
        }
    }

    private static void copyCargoArray(Cargo[] src, Cargo[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

    public static void addCarrier(Carrier carrier) {
        carrier.setId(IdGenerator.generateId());
        carriers[carrierIndex] = carrier;
        carrierIndex++;

        if (carrierIndex % (ARRAY_CAPACITY - 1) == 0) {
            Carrier[] newCarriers = new Carrier[carrierIndex + ARRAY_CAPACITY];
            copyCarrierArray(carriers, newCarriers);
            carriers = newCarriers;
        }
    }

    private static void copyCarrierArray(Carrier[] src, Carrier[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }
}

