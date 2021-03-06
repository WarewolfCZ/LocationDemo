package cz.denisfiser.location.model;

/**
 * CRUD for Location
 * Created by Denis on 30. 9. 2015.
 */

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

@EnableTransactionManagement
public interface LocationRepository extends CrudRepository<Location, Integer> {

    List<Location> findByVehicleId(String vehicleId, Pageable pageable);

    List<Location> findByVehicleIdAndTimeGreaterThanEqual(String vehicleId, int from, Pageable pageable);

    List<Location> findByVehicleIdAndTimeLessThan(String vehicleId, int to, Pageable top);

    List<Location> findByVehicleIdAndTimeBetween(String vehicleId, int from, int to, Pageable top);
}