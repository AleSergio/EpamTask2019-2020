package Homework8.common.solutions.utils;

import Homework8.cargo.domain.Cargo;

import static Homework8.storage.Storage.cargosStorage;

public final class ArrayUtils {

    private ArrayUtils() {
    }

    public static void copyArray(Object[] src, Object[] dest) {
        System.arraycopy(src, 0, dest, 0, src.length);
    }

    public static void copyArray(Object[] src, Object[] dest, int Arraylength) {
        System.arraycopy(src, 0, dest, 0, Arraylength);
    }

    public static void printArray(Object[] arr) {
        for (Object obj : arr) {
            if (obj != null) {
                System.out.println(obj);
            }
        }
    }

    public static void removeElement(Object[] arr, int index) {
        System.arraycopy(arr, index + 1, arr, index, arr.length - 1 - index);
    }


    public static Cargo CargoInList(long id){
        for (Cargo cargo : cargosStorage) {
            if (Long.valueOf(id).equals(cargo.getId())) {
                return cargo;
            }
        }
        return null;
    }

}
