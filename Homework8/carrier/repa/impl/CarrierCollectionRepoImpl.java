package Homework8.carrier.repa.impl;

import Homework8.carrier.domain.Carrier;
import Homework8.carrier.repa.CarrierRepo;
import Homework8.storage.IdGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import static Homework8.storage.Storage.carriersStorage;

public class CarrierCollectionRepoImpl implements CarrierRepo {

    @Override
    public void add(Carrier carrier) {
        carrier.setId(IdGenerator.generateId());
        carriersStorage.add(carrier);
    }

    @Override
    public Carrier getById(long id) {
        for (Carrier carrier : carriersStorage) {
            if (Long.valueOf(id).equals(carrier.getId())) {
                return carrier;
            }
        }

        return null;
    }

    @Override
    public Carrier[] getByName(String name) {
        List<Carrier> result = new ArrayList<>();

        for (Carrier carrier : carriersStorage) {
            if (Objects.equals(carrier.getName(), name)) {
                result.add(carrier);
            }
        }

        return result.toArray(new Carrier[0]);
    }

    @Override
    public boolean deleteById(long id) {
        Iterator<Carrier> iter = carriersStorage.iterator();

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
    public List<Carrier> getAll() {
        return carriersStorage;
    }

    @Override
    public void updateCarriers(Carrier carrier) {

    }
}
