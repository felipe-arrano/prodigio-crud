package cl.prodigio.prodigiocrud.controller;

import cl.prodigio.prodigiocrud.dto.CreateVehicleMilesTraveledRequest;
import cl.prodigio.prodigiocrud.dto.GetVehicleMilesTraveledResponse;
import cl.prodigio.prodigiocrud.service.VehicleMilesTraveledService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@SwaggerDefinition(info = @Info(description = "API REST que habilita un CRUD para Vehicle miles traveled", version = "1.0.0", title = "Vehicle miles traveled CRUD"),
        schemes = {SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS})
public class ProdigioCrudContoller {

    @Autowired
    private VehicleMilesTraveledService vehicleMilesTraveledService;

    @ApiOperation("Permite crear y almacenar un registro de Vehicle miles traveled")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Vehicle miles traveled Creado")})
    @PutMapping(value = "/vehicle-miles-traveled")
    public  ResponseEntity createVehicleMilesTraveled(@RequestBody CreateVehicleMilesTraveledRequest createVehicleMilesTraveledRequest){

        try {
            vehicleMilesTraveledService.createVehicleMilesTraveled(createVehicleMilesTraveledRequest);
            return ResponseEntity.status(HttpStatus.OK).body(null);
        } catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @ApiOperation("Permite obtener un registro de Vehicle miles traveled a través de su ID")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Registro de Vehicle miles traveled obtenido con éxito")})
    @GetMapping(value = "/vehicle-miles-traveled/{id}")
    public ResponseEntity<GetVehicleMilesTraveledResponse> getVehicleMilesTraveled(@PathVariable(value = "id") Long id){

        try {
            return ResponseEntity.status(HttpStatus.OK).
                    body(vehicleMilesTraveledService.getVehicleMilesTraveled(id));
        }catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

    @ApiOperation("Permite eliminar un registro de Vehicle miles traveled a través de su ID")
    @ApiResponses(value = {@ApiResponse(code = 200, message = "Registro de Vehicle miles traveled eliminado con éxito")})
    @DeleteMapping(value = "/vehicle-miles-traveled/{id}")
    public  ResponseEntity deleteVehicleMilesTraveled(@PathVariable(value = "id") Long id){

        try {
            vehicleMilesTraveledService.deleteVehicleMilesTraveled(id);
            return ResponseEntity.status(HttpStatus.OK).body(null);
        } catch (Exception ex){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}
