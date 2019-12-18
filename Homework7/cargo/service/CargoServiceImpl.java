package Homework7.cargo.service;


import Homework7.cargo.domain.Cargo;
import Homework7.cargo.repa.CargoRepo;


public class CargoServiceImpl implements CargoService {
    private static final Cargo[] EMPTY_CARGO_ARRAY = new Cargo[0];

    private CargoRepo cargoRepo;

    @Override
    public void add(Cargo cargo) {
        System.out.println("Begin to add cargo");
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
    public Cargo[] getByName(String name) {
        if (name != null) {
            return cargoRepo.getByName(name);
        }
        return EMPTY_CARGO_ARRAY;
    }

    @Override
    public boolean deleteById(Long id) {
        if (id != null) {
            cargoRepo.deleteById(id);
        }
        return true;
    }
}
