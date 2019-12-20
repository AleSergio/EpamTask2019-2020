package Homework8.transportation.repa;

import Homework8.common.business.repo.CommonRepo;
import Homework8.transportation.domain.Transportation;

import java.util.List;

public interface TransportationRepo extends CommonRepo {
    void add(Transportation transportation);

    Transportation getById(long id);

    List<Transportation> getAll();

    void updateTransportations(Transportation transportation);
}
