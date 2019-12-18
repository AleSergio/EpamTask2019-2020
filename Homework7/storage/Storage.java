package Homework7.storage;

import Homework7.cargo.domain.Cargo;
import Homework7.carrier.domain.Carrier;
import Homework7.transportation.domain.Transportation;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static final int ARRAY_CAPACITY = 10;

    public static Cargo[] cargos = new Cargo[ARRAY_CAPACITY];
    public static int cargoIndex = 0;

    public static Carrier[] carriers = new Carrier[ARRAY_CAPACITY];
    public static int carrierIndex = 0;

    public static Transportation[] transportations = new Transportation[ARRAY_CAPACITY];
    public static int transportationIndex = 0;


    public static List<Cargo> cargosStorage = new ArrayList<>();
    public static List<Carrier> carriersStorage = new ArrayList<>();
    public static List<Transportation> transportationsStorage = new ArrayList<>();


}
