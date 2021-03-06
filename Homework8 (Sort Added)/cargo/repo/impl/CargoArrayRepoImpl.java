package Homework8.cargo.repo.impl;

import Homework8.cargo.domain.Cargo;
import Homework8.cargo.repo.CargoRepo;
import Homework8.common.solutions.utils.ArrayUtils;
import Homework8.storage.IdGenerator;

import java.util.*;

import static Homework8.common.business.repo.CommonRepoHelper.findEntityIndexInArrayStorageById;
import static Homework8.storage.Storage.*;

public class CargoArrayRepoImpl implements CargoRepo {

    private static final Cargo[] EMPTY_CARGO_ARRAY = new Cargo[0];
    private CargoRepo cargoRepo;

    @Override
    public void add(Cargo cargo) {
        if (cargoIndex == cargoArray.length) {
            Cargo[] newCargos = new Cargo[cargoArray.length * 2];
            ArrayUtils.copyArray(cargoArray, newCargos);
            cargoArray = newCargos;
        }

        cargo.setId(IdGenerator.generateId());
        cargoArray[cargoIndex] = cargo;
        cargoIndex++;
    }

    @Override
    public Cargo getById(long id) {
        for (Cargo cargo : cargoArray) {
            if (cargo != null && Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }

        return null;
    }

    @Override
    public Cargo[] getByName(String name) {
        Cargo[] searchResultWithNullableElems = getByNameIncludingNullElements(name);
        if (searchResultWithNullableElems == null
                || searchResultWithNullableElems.length == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            return excludeNullableElementsFromArray(searchResultWithNullableElems);
        }
    }

    private Cargo[] getByNameIncludingNullElements(String name) {
        Cargo[] result = new Cargo[cargoArray.length];

        int curIndex = 0;
        for (Cargo carrier : cargoArray) {
            if (carrier != null && Objects.equals(carrier.getName(), name)) {
                result[curIndex++] = carrier;
            }
        }

        return result;
    }


    private Cargo[] excludeNullableElementsFromArray(Cargo[] cargos) {
        int sizeOfArrWithNotNullElems = 0;

        for (Cargo cargo : cargos) {
            if (cargo != null) {
                sizeOfArrWithNotNullElems++;
            }
        }

        if (sizeOfArrWithNotNullElems == 0) {
            return EMPTY_CARGO_ARRAY;
        } else {
            Cargo[] result = new Cargo[sizeOfArrWithNotNullElems];
            int index = 0;
            for (Cargo cargo : cargos) {
                if (cargo != null) {
                    result[index++] = cargo;
                }
            }

            return result;
        }
    }

    @Override
    public boolean deleteById(long id) {
        Integer indexToDelete = findEntityIndexInArrayStorageById(cargoArray, id);

        if (indexToDelete == null) {
            return false;
        } else {
            ArrayUtils.removeElement(cargoArray, indexToDelete);
            return true;
        }
    }

    @Override
    public List<Cargo> getAll() {
        return Arrays.asList(cargoArray);
    }

    @Override
    public void updateCargos(Cargo cargo) {

    }

    @Override
    public Cargo[] sortCargos(TypeSort typeSort) {
        Cargo[] allCargos = new Cargo[cargoIndex];
        ArrayUtils.copyArray(cargoArray, allCargos, cargoIndex);
        switch (typeSort) {
            case NAME:
                Arrays.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return cargo.getName().compareTo(o1.getName());
                    }
                });
                break;
            case WEIGHT:
                Arrays.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return Integer.compare(cargo.getWeight(), o1.getWeight());
                    }
                });
            case NAME_WEIGHT:
                Arrays.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return (cargo.getName().compareTo(o1.getName()) + Integer.compare(cargo.getWeight(), o1.getWeight()));
                    }
                });
            case REVERSE_NAME_WEIGHT:
                Arrays.sort(allCargos, new Comparator<Cargo>() {
                    @Override
                    public int compare(Cargo cargo, Cargo o1) {
                        return (-1)*(cargo.getName().compareTo(o1.getName()) + Integer.compare(cargo.getWeight(), o1.getWeight()));
                    }
                });
        }
        return allCargos;
    }
}
