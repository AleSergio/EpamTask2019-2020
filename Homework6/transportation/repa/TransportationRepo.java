package Homework6.transportation.repa;

import Homework6.common.business.repo.CommonRepo;
import Homework6.transportation.domain.Transportation;

public interface TransportationRepo extends CommonRepo {
    void add(Transportation transportation);

    Transportation getById(long id);
}
