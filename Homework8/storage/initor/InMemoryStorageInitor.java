package Homework8.storage.initor;

import Homework8.application.serviceholder.ServiceHolder;
import Homework8.cargo.domain.ClothersCargo;
import Homework8.cargo.domain.FoodCargo;
import Homework8.cargo.service.CargoService;
import Homework8.carrier.domain.Carrier;
import Homework8.carrier.service.CarrierService;
import Homework8.transportation.domain.Transportation;
import Homework8.transportation.service.TransportationService;

import java.util.Date;

public class InMemoryStorageInitor implements StorageInitor {

    private static final int TOTAL_ENTITIES_IN_GROUP = 6;

    private final CarrierService carrierService;
    private final CargoService cargoService;
    private final TransportationService transportationService;

    public InMemoryStorageInitor() {
        carrierService = ServiceHolder.getInstance().getCarrierService();
        cargoService = ServiceHolder.getInstance().getCargoService();
        transportationService = ServiceHolder.getInstance().getTransportationService();
    }

    @Override
    public void initStorage() {
        initCargos();
        initCarriers();
        initTransportations();
    }

    private void initCargos() {
        for (int i = 0; i < TOTAL_ENTITIES_IN_GROUP / 2; i++) {
            cargoService.add(createClothersCargo(i));
        }
        for (int i = 0; i < TOTAL_ENTITIES_IN_GROUP / 2; i++) {
            cargoService.add(createFoodCargo(i));
        }
    }

    private ClothersCargo createClothersCargo(int index) {
        ClothersCargo cargo = new ClothersCargo();
        cargo.setSize("Clothers_Size_" + index);
        cargo.setName("Clothers_Name_" + index);

        return cargo;
    }

    private FoodCargo createFoodCargo(int index) {
        FoodCargo cargo = new FoodCargo();
        cargo.setExpirationDate(new Date());
        cargo.setStoreTemperature(index);
        cargo.setName("FoodCargo_Name_" + index);

        return cargo;
    }

    private void initCarriers() {
        for (int i = 0; i < TOTAL_ENTITIES_IN_GROUP; i++) {
            Carrier carrier = createCarrier(i);
            carrierService.add(carrier);
        }
    }

    private Carrier createCarrier(int index) {
        Carrier carrier = new Carrier();
        carrier.setName("Carrier_Name");
        carrier.setAddress("Address_" + index);
        return carrier;
    }

    private void initTransportations() {
        for (int i = 0; i < TOTAL_ENTITIES_IN_GROUP; i++) {
            Transportation transportation = createTransportation(i + 1, i + 1 + TOTAL_ENTITIES_IN_GROUP);
            transportationService.add(transportation);
        }
    }

    private Transportation createTransportation(long cargoId, long carrierId) {
        Transportation transportation = new Transportation();
        transportation.setCargo(cargoService.getById(cargoId));
        transportation.setCarrier(carrierService.getById(carrierId));
        transportation.setDescription("Transportation");

        return transportation;
    }

}
