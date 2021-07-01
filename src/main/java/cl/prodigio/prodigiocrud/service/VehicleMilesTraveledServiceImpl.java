package cl.prodigio.prodigiocrud.service;

import cl.prodigio.prodigiocrud.domain.VehicleMilesTraveledEntity;
import cl.prodigio.prodigiocrud.dto.CreateVehicleMilesTraveledRequest;
import cl.prodigio.prodigiocrud.dto.GetVehicleMilesTraveledResponse;
import cl.prodigio.prodigiocrud.repository.VehicleMilesTraveledRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleMilesTraveledServiceImpl implements VehicleMilesTraveledService{

    @Autowired
    private VehicleMilesTraveledRepository vehicleMilesTraveledRepository;

    @Override
    public void createVehicleMilesTraveled(CreateVehicleMilesTraveledRequest createVehicleMilesTraveledRequest) {

        VehicleMilesTraveledEntity vehicleMilesTraveledEntity = new VehicleMilesTraveledEntity();
        vehicleMilesTraveledEntity.setCountyName(createVehicleMilesTraveledRequest.getCountyName());
        vehicleMilesTraveledEntity.setBaselineJanVmt(createVehicleMilesTraveledRequest.getBaselineJanVmt());
        vehicleMilesTraveledEntity.setCountyFips(createVehicleMilesTraveledRequest.getCountyFips());
        vehicleMilesTraveledEntity.setDate(createVehicleMilesTraveledRequest.getDate());
        vehicleMilesTraveledEntity.setCountyVmt(createVehicleMilesTraveledRequest.getCountyVmt());
        vehicleMilesTraveledEntity.setDateAtLow(createVehicleMilesTraveledRequest.getDateAtLow());
        vehicleMilesTraveledEntity.setMean7CountyVmt(createVehicleMilesTraveledRequest.getMean7CountyVmt());
        vehicleMilesTraveledEntity.setMean7CountyVmtAtLow(createVehicleMilesTraveledRequest.getMean7CountyVmtAtLow());
        vehicleMilesTraveledEntity.setMean7PercentChangeFromJan(createVehicleMilesTraveledRequest.getMean7PercentChangeFromJan());
        vehicleMilesTraveledEntity.setPercentChangeFromJan(createVehicleMilesTraveledRequest.getPercentChangeFromJan());
        vehicleMilesTraveledEntity.setPercentChangeFromLow(createVehicleMilesTraveledRequest.getPercentChangeFromLow());
        vehicleMilesTraveledEntity.setMean7PercentChangeFromJan(createVehicleMilesTraveledRequest.getMean7PercentChangeFromJan());
        vehicleMilesTraveledEntity.setStateName(createVehicleMilesTraveledRequest.getStateName());

        vehicleMilesTraveledRepository.save(vehicleMilesTraveledEntity);
    }

    @Override
    public GetVehicleMilesTraveledResponse getVehicleMilesTraveled(Long id) {

        VehicleMilesTraveledEntity vehicleMilesTraveledEntity = vehicleMilesTraveledRepository.getById(id);

        GetVehicleMilesTraveledResponse getVehicleMilesTraveledResponse = new GetVehicleMilesTraveledResponse();
        getVehicleMilesTraveledResponse.setId(vehicleMilesTraveledEntity.getId());
        getVehicleMilesTraveledResponse.setCountyName(vehicleMilesTraveledEntity.getCountyName());
        getVehicleMilesTraveledResponse.setBaselineJanVmt(vehicleMilesTraveledEntity.getBaselineJanVmt());
        getVehicleMilesTraveledResponse.setCountyFips(vehicleMilesTraveledEntity.getCountyFips());
        getVehicleMilesTraveledResponse.setDate(vehicleMilesTraveledEntity.getDate());
        getVehicleMilesTraveledResponse.setCountyVmt(vehicleMilesTraveledEntity.getCountyVmt());
        getVehicleMilesTraveledResponse.setDateAtLow(vehicleMilesTraveledEntity.getDateAtLow());
        getVehicleMilesTraveledResponse.setMean7CountyVmt(vehicleMilesTraveledEntity.getMean7CountyVmt());
        getVehicleMilesTraveledResponse.setMean7CountyVmtAtLow(vehicleMilesTraveledEntity.getMean7CountyVmtAtLow());
        getVehicleMilesTraveledResponse.setMean7PercentChangeFromJan(vehicleMilesTraveledEntity.getMean7PercentChangeFromJan());
        getVehicleMilesTraveledResponse.setPercentChangeFromJan(vehicleMilesTraveledEntity.getPercentChangeFromJan());
        getVehicleMilesTraveledResponse.setPercentChangeFromLow(vehicleMilesTraveledEntity.getPercentChangeFromLow());
        getVehicleMilesTraveledResponse.setMean7PercentChangeFromJan(vehicleMilesTraveledEntity.getMean7PercentChangeFromJan());
        getVehicleMilesTraveledResponse.setStateName(vehicleMilesTraveledEntity.getStateName());

        return getVehicleMilesTraveledResponse;
    }

    @Override
    public void deleteVehicleMilesTraveled(Long id) {

        VehicleMilesTraveledEntity vehicleMilesTraveledEntity = new VehicleMilesTraveledEntity();
        vehicleMilesTraveledEntity.setId(id);

        vehicleMilesTraveledRepository.delete(vehicleMilesTraveledEntity);
    }
}
