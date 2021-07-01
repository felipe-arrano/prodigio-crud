package cl.prodigio.prodigiocrud;

import cl.prodigio.prodigiocrud.controller.ProdigioCrudContoller;
import cl.prodigio.prodigiocrud.dto.GetVehicleMilesTraveledResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

class ProdigiocrudApplicationTests {

    @InjectMocks
    private ProdigioCrudContoller prodigioCrudContoller;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testCreateVehicleMilesTraveled(){
    }

    @Test
    public void testGetVehicleMilesTraveled(){
    }

    @Test
    public void testDeleteVehicleMilesTraveled(){
    }

    @Test
    void contextLoads() {
    }

}
