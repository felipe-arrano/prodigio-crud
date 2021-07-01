package cl.prodigio.prodigiocrud.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "vehicle_miles_traveled")
public class VehicleMilesTraveledEntity {


    @Id
    @GeneratedValue
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
