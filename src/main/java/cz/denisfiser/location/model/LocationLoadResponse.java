package cz.denisfiser.location.model;

import java.util.List;

/**
 * Locations
 * Created by Denis on 14. 3. 2016.
 */
public class LocationLoadResponse {
    private String vehicleId;
    private int timestamp;
    private int count;
    private List<Location> locations;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
