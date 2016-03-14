package cz.denisfiser.location.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Location info
 * Created by Denis on 14. 3. 2016.
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "loc_id")
    private int id;
    @Column(name = "vehicle_id")
    private String vehicleId;
    @Column(name = "loc_time")
    private int time;
    @Column(name = "latitude")
    private double lat;
    @Column(name = "longitude")
    private double lng;

    public Location(String vehicleId, double latitude, double longitude) {
        this.vehicleId = vehicleId;
        this.lat = latitude;
        this.lng = longitude;
    }

    @JsonIgnore
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonIgnore
    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
