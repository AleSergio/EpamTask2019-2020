package Homework8.cargo.repa.impl;

import Homework8.cargo.domain.Cargo;
import Homework8.cargo.repa.CargoRepo;
import Homework8.storage.IdGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static Homework8.storage.Storage.cargosStorage;

public class CargoCollectionRepoImpl implements CargoRepo {

    @Override
    public void add(Cargo carrier) {
        carrier.setId(IdGenerator.generateId());
        cargosStorage.add(carrier);
    }

    @Override
    public Cargo getById(long id) {
        for (Cargo carrier : cargosStorage) {
            if (Long.valueOf(id).equals(carrier.getId())) {
                return carrier;
            }
        }

        return null;
    }

    @Override
    public Cargo[] getByName(String name) {
        List<Cargo> result = new ArrayList<>();

        for (Cargo carrier : cargosStorage) {
            if (Objects.equals(carrier.getName(), name)) {
                result.add(carrier);
            }
        }

        return result.toArray(new Cargo[0]);
    }

    @Override
    public List<Cargo> getAll() {
        return cargosStorage;
    }

    @Override
    public void updateCargos(Cargo cargo) {

    }

    @Override
    public boolean deleteById(long id) {
        Iterator<Cargo> iter = cargosStorage.iterator();

        boolean removed = false;
        while (iter.hasNext()) {
            if (Long.valueOf(id).equals(iter.next().getId())) {
                iter.remove();
                removed = true;
                break;
            }
        }

        return removed;
    }
}


