package Homework7.transportation.repa.impl;

import Homework7.common.utils.ArrayUtils;
import Homework7.storage.IdGenerator;
import Homework7.storage.Storage;
import Homework7.transportation.domain.Transportation;
import Homework7.transportation.repa.TransportationRepo;

import static Homework7.storage.Storage.transportationIndex;

public class TransportationArrayRepoImpl implements TransportationRepo {

    @Override
    public void add(Transportation transportation) {
        if (transportationIndex == Storage.transportations.length) {
            Transportation[] newTransportations =
                    new Transportation[Storage.transportations.length * 2];
            ArrayUtils.copyArray(Storage.transportations, newTransportations);
            Storage.transportations = newTransportations;
        }

        transportation.setId(IdGenerator.generateId());
        Storage.transportations[transportationIndex] = transportation;
        transportationIndex++;
    }

    @Override
    public Transportation getById(long id) {
        for (Transportation transportation : Storage.transportations) {
            if (transportation != null && Long.valueOf(id).equals(transportation.getId())) {
                return transportation;
            }
        }

        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }
}
