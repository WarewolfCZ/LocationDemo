package cz.denisfiser.location.model;

import java.util.Calendar;

/**
 * Response to location store request
 * Created by Denis on 14. 3. 2016.
 */
public class LocationStoreResponse {
    private boolean status;
    private String statusMessage;
    private int timestamp;

    public LocationStoreResponse() {
        status = true;
        timestamp = (int) (Calendar.getInstance().getTimeInMillis() / 1000L);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String status) {
        this.statusMessage = status;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }
}
