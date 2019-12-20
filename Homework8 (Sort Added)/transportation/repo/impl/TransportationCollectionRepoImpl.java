package Homework8.transportation.repo.impl;

import Homework8.storage.IdGenerator;
import Homework8.transportation.domain.Transportation;
import Homework8.transportation.repo.TransportationRepo;

import java.util.Iterator;
import java.util.List;

import static Homework8.storage.Storage.transportationsStorage;

public class TransportationCollectionRepoImpl implements TransportationRepo {

    @Override
    public void add(Transportation transportation) {
        transportation.setId(IdGenerator.generateId());
        transportationsStorage.add(transportation);
    }

    @Override
    public Transportation getById(long id) {
        for (Transportation transportation : transportationsStorage) {
            if (Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }

        return null;
    }

    @Override
    public List<Transportation> getAll() {
        return transportationsStorage;
    }

    @Override
    public void updateTransportations(Transportation transportation) {

    }

    @Override
    public boolean deleteById(long id) {
        boolean deleted = false;

        Iterator<Transportation> iter = transportationsStorage.iterator();
        while (iter.hasNext()) {
            if (Long.valueOf(id).equals(iter.next().getId())) {
                iter.remove();
                deleted = true;
                break;
            }
        }
        return deleted;
    }
}
