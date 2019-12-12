package Homework4;

import Homework4.cargo.domain.Cargo;

public class Demo {
            public static void main(String[] args) {
                Cargo cargo = new Cargo();
                cargo.setName("apple");
                Storage.addCargo(cargo);
                cargo = new Cargo();
                cargo.setName("orange");
                Storage.addCargo(cargo);
                cargo = new Cargo();
                cargo.setName("banana");
                Storage.addCargo(cargo);
                Storage.printAllCargos();
            }
        }
