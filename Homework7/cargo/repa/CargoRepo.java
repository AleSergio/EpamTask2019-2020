package Homework7.cargo.repa;

import Homework7.cargo.domain.Cargo;
import Homework7.common.business.repo.CommonRepo;

public interface CargoRepo extends CommonRepo {

    void add(Cargo cargo);

    Cargo getById(long id);

    Cargo[] getByName(String name);

    boolean deleteById(long id);
}
