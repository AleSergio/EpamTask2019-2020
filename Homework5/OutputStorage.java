package Homework5;

import Homework5.cargo.domain.Cargo;
import Homework5.cargo.domain.CargoType;
import Homework5.carrier.Carrier;
import Homework5.carrier.CarrierType;

public class OutputStorage extends Storage {
    public static void printAllCargos() {
        for (Cargo cargo : cargos) {
            if (cargo != null) {
                System.out.println(cargo);
            }
        }
    }

    public static void printAllCarriers() {
        for (Carrier carrier : carriers) {
            if (carrier != null) {
                System.out.println(carrier);
            }
        }
    }

    public static void printById(long id) {
        for (Cargo cargo : cargos) {
            if (cargo != null && id == cargo.getId()) {
                System.out.println(cargo);
            }
        }
        for (Carrier carrier : carriers) {
            if (carrier != null && id == carrier.getId()) {
                System.out.println(carrier);
            }
        }
    }

    public static void printByName(String string) {
        for (Cargo cargo : cargos) {
            if (cargo != null && string.equals(cargo.getName())) {
                System.out.println(cargo);
            }
        }
        for (Carrier carrier : carriers) {
            if (carrier != null && string.equals(carrier.getName())) {
                System.out.println(carrier);
            }
        }
    }
    public static void printByWeight(int weight) {
        for (Cargo cargo : cargos) {
            if (cargo != null && weight == cargo.getWeight()) {
                System.out.println(cargo);
            }
        }
    }

    public static void printByAddress(String address) {
        for (Carrier carrier : carriers) {
            if (carrier != null && address == carrier.getAddress()) {
                System.out.println(carrier);
            }
        }
    }

    public static void printByCargoType(CargoType cargotype) {
        for (Cargo cargo : cargos) {
            if (cargo != null && cargotype.equals(cargo.getCargoType())) {
                System.out.println(cargo);
            }
        }
    }
    public static void printByCarrierType(CarrierType carrierType) {
        for (Carrier carrier : carriers) {
            if (carrier != null && carrierType.equals(carrier.getCarrierType())) {
                System.out.println(carrier);
            }
        }
    }
}
