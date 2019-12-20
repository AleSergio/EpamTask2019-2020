package Homework8.cargo.repa;

import Homework8.cargo.domain.Cargo;
import Homework8.common.business.repo.CommonRepo;

import java.util.List;

public interface CargoRepo extends CommonRepo {

    void add(Cargo cargo);

    Cargo getById(long id);

    Cargo[] getByName(String name);

    List<Cargo> getAll();

    void updateCargos(Cargo cargo);


}
