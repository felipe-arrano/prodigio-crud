package cl.prodigio.prodigiocrud.repository;

import cl.prodigio.prodigiocrud.domain.VehicleMilesTraveledEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMilesTraveledRepository extends JpaRepository<VehicleMilesTraveledEntity, Long> {
}
