package Homework7.cargo.repa.impl;

import Homework7.cargo.domain.Cargo;
import Homework7.cargo.repa.CargoRepo;
import Homework7.storage.IdGenerator;

import java.util.ArrayList;
import java.util.List;

import static Homework7.common.utils.ArrayUtils.CargoInList;
import static Homework7.storage.Storage.cargosStorage;

public class CargoCollectionRepoImpl implements CargoRepo {


    @Override
    public void add(Cargo cargo) {
        cargo.setId(IdGenerator.generateId());
        cargosStorage.add(cargo);
    }

    @Override
    public Cargo[] getByName(String name) {
        List<Cargo> result = new ArrayList<>();
        for (Cargo cargo : cargosStorage) {
            if (cargo.getName() != null && cargo.getName().equals(name)) {
                result.add(cargo);
            }
        }
        return (Cargo[]) result.toArray();
    }

    @Override
    public Cargo getById(long id) {
        for (Cargo item : cargosStorage) {
            if (item.getId() != null && item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        Cargo idFound = CargoInList(id);
        if (idFound != null) {
            cargosStorage.remove(idFound);
            return true;
        } else {
            return false;
        }
    }
}


