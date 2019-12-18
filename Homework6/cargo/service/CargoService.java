package Homework6.cargo.service;

import Homework6.cargo.domain.Cargo;
import Homework6.common.business.service.CommonService;

public interface CargoService extends CommonService {
    void add(Cargo cargo);

    Cargo getById(Long id);
}
