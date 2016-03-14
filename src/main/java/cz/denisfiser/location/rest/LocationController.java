package cz.denisfiser.location.rest;

/**
 * Location REST controller
 * Created by Denis on 14. 3. 2016.
 */
import cz.denisfiser.location.model.LocationLoadResponse;
import cz.denisfiser.location.model.LocationStoreResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    public static final int DEFAULT_LOCATION_LIMIT = 1000;
    @Autowired
    private LocationStorage storage;

    @RequestMapping("location/load")
    public LocationLoadResponse load(
            @RequestParam("vehicle_id") String vehicleId,
            @RequestParam(value = "from", required = false) Integer from,
            @RequestParam(value = "to", required = false) Integer to,
            @RequestParam(value = "limit", required = false, defaultValue = DEFAULT_LOCATION_LIMIT + "") Integer limit
    ) {
        return storage.loadLocations(vehicleId, from, to, limit);
    }

    @RequestMapping("location/store")
    public LocationStoreResponse store(
            @RequestParam("vehicle_id") String id,
            @RequestParam("lat") double latitude,
            @RequestParam("lng") double longitude) {
        return storage.storeLocation(id, latitude, longitude);
    }

}