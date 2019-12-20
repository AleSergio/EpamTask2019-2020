package Homework8.cargo.service;


import Homework8.cargo.domain.Cargo;
import Homework8.cargo.repa.CargoRepo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CargoServiceImpl implements CargoService {

    private CargoRepo cargoRepo;

    public CargoServiceImpl(CargoRepo cargoRepo) {
        this.cargoRepo = cargoRepo;
    }

    @Override
    public void add(Cargo cargo) {
        cargoRepo.add(cargo);
    }

    @Override
    public Cargo getById(Long id) {
        if (id != null) {
            return cargoRepo.getById(id);
        }
        return null;
    }

    @Override
    public List<Cargo> getAll() {
        return cargoRepo.getAll();
    }

    @Override
    public List<Cargo> getByName(String name) {
        Cargo[] found = cargoRepo.getByName(name);
        return (found == null || found.length == 0) ? Collections.emptyList() : Arrays.asList(found);
    }

    @Override
    public boolean deleteById(Long id) {
        return cargoRepo.deleteById(id);
    }

    @Override
    public void printAll() {
        List<Cargo> allCargos = cargoRepo.getAll();

        for (Cargo cargo : allCargos) {
            System.out.println(cargo);
        }
    }

    @Override
    public void sortCargosByName() {
        List<Cargo> allCargos = cargoRepo.getAll();
        Collections.sort(allCargos, new Comparator<Cargo>() {
            @Override
            public int compare(Cargo cargo, Cargo o1) {
                return cargo.getName().compareTo(o1.getName());
            }
        });
    }

    @Override
    public void sortCargosByWeight() {
        List<Cargo> allCargos = cargoRepo.getAll();
        Collections.sort(allCargos, new Comparator<Cargo>() {
            @Override
            public int compare(Cargo cargo, Cargo o1) {
                return Integer.compare(cargo.getWeight(), o1.getWeight());
            }
        });
    }

    @Override
    public void sortCargosByNameAndWeight() {
        List<Cargo> allCargos = cargoRepo.getAll();
        Collections.sort(allCargos, new Comparator<Cargo>() {
            @Override
            public int compare(Cargo cargo, Cargo o1) {
                return (cargo.getName().compareTo(o1.getName()) + Integer.compare(cargo.getWeight(), o1.getWeight()));
            }
        });
    }

    @Override
    public void updateCargos(Cargo cargo) {
        if(cargo != null) {
            cargoRepo.updateCargos(cargo);
        }
    }
}

