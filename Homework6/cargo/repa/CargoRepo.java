package Homework6.cargo.repa;

import Homework6.cargo.domain.Cargo;
import Homework6.common.business.repo.CommonRepo;

public interface CargoRepo extends CommonRepo {

    void add(Cargo cargo);

    Cargo getById(long id);

    Cargo[] getByName(String name);
}
