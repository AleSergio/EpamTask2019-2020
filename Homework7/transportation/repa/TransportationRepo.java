package Homework7.transportation.repa;

import Homework7.common.business.repo.CommonRepo;
import Homework7.transportation.domain.Transportation;

public interface TransportationRepo extends CommonRepo {
    void add(Transportation transportation);

    Transportation getById(long id);
}
