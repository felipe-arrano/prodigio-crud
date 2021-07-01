package cl.prodigio.prodigiocrud.service;

import cl.prodigio.prodigiocrud.dto.CreateVehicleMilesTraveledRequest;
import cl.prodigio.prodigiocrud.dto.GetVehicleMilesTraveledResponse;

public interface VehicleMilesTraveledService {

    void createVehicleMilesTraveled(CreateVehicleMilesTraveledRequest createVehicleMilesTraveledRequest);
    GetVehicleMilesTraveledResponse getVehicleMilesTraveled(Long id);
    void deleteVehicleMilesTraveled(Long id);
}
