package Homework8.cargo.service;

import Homework8.cargo.domain.Cargo;
import Homework8.cargo.repo.impl.TypeSort;
import Homework8.common.business.service.CommonService;

import java.util.List;

public interface CargoService extends CommonService {
    void add(Cargo cargo);

    Cargo getById(Long id);

    List<Cargo> getAll();

    List<Cargo> getByName(String name);

    Cargo[] sortCargos(TypeSort typeSort);

    void updateCargos(Cargo cargo);
}
