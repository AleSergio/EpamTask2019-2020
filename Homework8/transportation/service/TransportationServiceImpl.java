package Homework8.transportation.service;

import Homework8.carrier.domain.Carrier;
import Homework8.transportation.domain.Transportation;
import Homework8.transportation.repa.TransportationRepo;

import java.util.List;

public class TransportationServiceImpl implements TransportationService {

    private TransportationRepo transportationRepo;

    public TransportationServiceImpl(
            TransportationRepo transportationRepo) {
        this.transportationRepo = transportationRepo;
    }

    @Override
    public boolean deleteById(Long id) {
        return transportationRepo.deleteById(id);
    }

    @Override
    public void printAll() {
        List<Transportation> allTransportations = transportationRepo.getAll();
        for (Transportation transportation : allTransportations) {
            System.out.println(transportation);
        }
    }

    @Override
    public void add(Transportation transportation) {
        transportationRepo.add(transportation);
    }

    @Override
    public Transportation getById(Long id) {
        return transportationRepo.getById(id);
    }

    @Override
    public List<Transportation> getAll() {
        return transportationRepo.getAll();
    }

    @Override
    public void updateTransportations(Transportation transportation) {
        if(transportation != null) {
            transportationRepo.updateTransportations(transportation);
        }
    }
}
