package Homework8.carrier.service;

import Homework8.carrier.domain.Carrier;
import Homework8.common.business.service.CommonService;

import java.util.List;

public interface CarrierService extends CommonService {
    void add(Carrier carrier);

    Carrier getById(Long id);

    List<Carrier> getByName(String name);

    List<Carrier> getAll();

    void printAll();

    void updateCarriers(Carrier carrier);
}
