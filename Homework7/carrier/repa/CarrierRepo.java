package Homework7.carrier.repa;

import Homework7.carrier.domain.Carrier;
import Homework7.common.business.repo.CommonRepo;

public interface CarrierRepo extends CommonRepo {

    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);

}
