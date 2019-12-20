package Homework8.cargo.repo.impl;

import Homework8.cargo.domain.Cargo;
import Homework8.cargo.repo.CargoRepo;
import Homework8.storage.IdGenerator;

import java.util.*;

import static Homework8.storage.Storage.cargosStorage;

public class CargoCollectionRepoImpl implements CargoRepo {

    private CargoRepo cargoRepo;

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

    @Override
    public Cargo[] sortCargos(TypeSort typeSort) {
        List<Cargo> allCargos = new ArrayList<>(cargosStorage);
        switch (typeSort) {
            case NAME:
                Collections.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return cargo.getName().compareTo(o1.getName());
                    }
                });
                break;
            case WEIGHT:
                Collections.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return Integer.compare(cargo.getWeight(), o1.getWeight());
                    }
                });
            case NAME_WEIGHT:
                Collections.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return (cargo.getName().compareTo(o1.getName()) + Integer.compare(cargo.getWeight(), o1.getWeight()));
                    }
                });
            case REVERSE_NAME_WEIGHT:
                Collections.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return (-1)*(cargo.getName().compareTo(o1.getName()) + Integer.compare(cargo.getWeight(), o1.getWeight()));
                    }
                });
        }
        return allCargos.toArray(new Cargo[0]);
    }
}


