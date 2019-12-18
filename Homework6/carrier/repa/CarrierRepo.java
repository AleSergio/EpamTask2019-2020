package Homework6.carrier.repa;

import Homework6.carrier.domain.Carrier;
import Homework6.common.business.repo.CommonRepo;

public interface CarrierRepo extends CommonRepo {

    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);

}
