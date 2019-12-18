package Homework7.cargo.service;

import Homework7.cargo.domain.Cargo;
import Homework7.common.business.service.CommonService;

public interface CargoService extends CommonService {
    void add(Cargo cargo);

    Cargo getById(Long id);

    Cargo[] getByName(String name);

    boolean deleteById(Long id);
}
