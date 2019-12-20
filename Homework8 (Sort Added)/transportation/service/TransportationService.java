package Homework8.transportation.service;

import Homework8.common.business.service.CommonService;
import Homework8.transportation.domain.Transportation;

import java.util.List;

public interface TransportationService extends CommonService {
    void add(Transportation transportation);

    Transportation getById(Long id);

    List<Transportation> getAll();

    void updateTransportations(Transportation transportation);
}
