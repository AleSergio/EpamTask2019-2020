package Homework5;

import Homework5.cargo.domain.Cargo;
import Homework5.cargo.domain.CargoType;
import Homework5.carrier.Carrier;
import Homework5.carrier.CarrierType;

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

    public static Cargo getAllCargos() {
        for (Cargo cargo : cargos) {
            if (cargo != null) {
                System.out.println(cargo);
            }
        }
        return null;
    }

    public static Carrier getAllCarriers() {
        for (Carrier carrier : carriers) {
            if (carrier != null) {
                System.out.println(carrier);
            }
        }
        return null;
    }

    public static Cargo getCargoById(long id) {
        for (Cargo cargo : cargos) {
            if (cargo != null && id == cargo.getId()) {
                System.out.println(cargo);
            }
        }
        return null;
    }

    public static Carrier getCarrierById(long id) {
        for (Carrier carrier : carriers) {
            if (carrier != null && id == carrier.getId()) {
                System.out.println(carrier);
            }
        }
        return null;
    }

    public static Cargo getCargoByName(String string) {
        for (Cargo cargo : cargos) {
            if (cargo != null && string.equals(cargo.getName())) {
                System.out.println(cargo);
            }
        }
        return null;
    }

    public static Carrier getCarrierByName(String string) {
        for (Carrier carrier : carriers) {
            if (carrier != null && string.equals(carrier.getName())) {
                System.out.println(carrier);
            }
        }
        return null;
    }

    public static Cargo getCargoByWeight(int weight) {
        for (Cargo cargo : cargos) {
            if (cargo != null && weight == cargo.getWeight()) {
                System.out.println(cargo);
            }
        }
        return null;
    }

    public static Carrier getCarrierByAddress(String address) {
        for (Carrier carrier : carriers) {
            if (carrier != null && address == carrier.getAddress()) {
                System.out.println(carrier);
            }
        }
        return null;
    }

    public static Cargo getByCargoType(CargoType cargotype) {
        for (Cargo cargo : cargos) {
            if (cargo != null && cargotype.equals(cargo.getCargoType())) {
                System.out.println(cargo);
            }
        }
        return null;
    }

    public static String getByCarrierType(CarrierType carrierType) {
        for (Carrier carrier : carriers) {
            if (carrier != null && carrierType.equals(carrier.getCarrierType())) {
                System.out.println(carrier);
            }
        }
        return null;
    }
}

