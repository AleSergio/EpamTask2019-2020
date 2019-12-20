package Homework8.storage;

import Homework8.cargo.domain.Cargo;
import Homework8.carrier.domain.Carrier;
import Homework8.transportation.domain.Transportation;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static final int ARRAY_CAPACITY = 10;

    public static Cargo[] cargoArray = new Cargo[ARRAY_CAPACITY];
    public static int cargoIndex = 0;
    public static List<Cargo> cargosStorage = new ArrayList<>();

    public static Carrier[] carrierArray = new Carrier[ARRAY_CAPACITY];
    public static int carrierIndex = 0;
    public static List<Carrier> carriersStorage = new ArrayList<>();

    public static Transportation[] transportationArray = new Transportation[ARRAY_CAPACITY];
    public static int transportationIndex = 0;
    public static List<Transportation> transportationsStorage = new ArrayList<>();
}
