package Homework6.cargo.service;


import Homework6.cargo.domain.Cargo;

class CargoServiceImpl implements CargoService {
    @Override
    public void add(Cargo cargo) {
        System.out.println("Begin tpo add cargo");
    }

    @Override
    public Cargo getById(Long id) {
        if (id != null) {

        }
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }
}
