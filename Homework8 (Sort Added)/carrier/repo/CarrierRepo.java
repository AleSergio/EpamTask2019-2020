package Homework8.carrier.repo;

import Homework8.carrier.domain.Carrier;
import Homework8.common.business.repo.CommonRepo;

import java.util.List;

public interface CarrierRepo extends CommonRepo {

    void add(Carrier carrier);

    Carrier getById(long id);

    Carrier[] getByName(String name);

    List<Carrier> getAll();

    void updateCarriers(Carrier carrier);
}
