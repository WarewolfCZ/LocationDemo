package cz.denisfiser.location.rest;

import cz.denisfiser.location.DemoApplication;
import cz.denisfiser.location.MyUtil;
import cz.denisfiser.location.model.Location;
import cz.denisfiser.location.model.LocationLoadResponse;
import cz.denisfiser.location.model.LocationRepository;
import cz.denisfiser.location.model.LocationStoreResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Location storage
 * Created by Denis on 4. 10. 2015.
 */
@Component
public class LocationStorage {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
    private static final String STATUS_EMPTY_VEHICLE_ID = "empty vehicle id";
    private static final String STATUS_SUCCESS = "success";
    @Autowired
    private LocationRepository locationRepository;

    public LocationStorage() {
    }

    /**
     * Store vehicle location to database
     * @param vehicleId vehicle identifier
     * @param latitude latitude
     * @param longitude longitude
     * @return LocationStoreResponse
     */
    public LocationStoreResponse storeLocation(String vehicleId, double latitude, double longitude) {
        LocationStoreResponse result = new LocationStoreResponse();
        if (MyUtil.isEmpty(vehicleId)) {
            result.setStatus(false);
            result.setStatusMessage(STATUS_EMPTY_VEHICLE_ID);
        } else {
            Location location = new Location(vehicleId, latitude, longitude);
            log.debug("Storing vehicle " + vehicleId + " location (lat:" + latitude + ", lng:" + longitude + ")");
            locationRepository.save(location);
            result.setStatus(true);
            result.setStatusMessage(STATUS_SUCCESS);
        }
        return result;
    }

    /**
     *
     * @param vehicleId vehicle identificator
     * @param from timestamp from
     * @param to timestamp to
     * @param limit limit result count
     * @return LocationLoadResponse
     */
    public LocationLoadResponse loadLocations(String vehicleId, int from, int to, int limit) {
        LocationLoadResponse result = new LocationLoadResponse();
        locationRepository.findByVehicleId(vehicleId);
        return result;
    }
}
