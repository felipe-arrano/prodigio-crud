package cl.prodigio.prodigiocrud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetVehicleMilesTraveledResponse {

    private Long id;
    private Long countyFips;
    private String countyName;
    private String stateName;
    private Date date;
    private Long countyVmt;
    private Long baselineJanVmt;
    private Double percentChangeFromJan;
    private Double mean7CountyVmt;
    private Double mean7PercentChangeFromJan;
    private Date dateAtLow;
    private Double mean7CountyVmtAtLow;
    private Double percentChangeFromLow;
}
