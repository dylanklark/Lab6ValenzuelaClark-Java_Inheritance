import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// Need to add a getDepartureTime that calculates the departure time



/**
 * A class representing air transportation (planes, helicopters, etc)
 */
public class AirTransportation extends Transportation {
    private Date departureTime;

    /**
     * Initializes the AirTransportation class with the departure time.
     * @param departureTime Date; the date (and time) the air transportation departs.
     */
    public AirTransportation(Date departureTime, String transportationType, double cost, double averageSpeed,
                             String purchaseType, int numPassengers) {
        super(transportationType, cost, averageSpeed, purchaseType, numPassengers);
        this.departureTime = departureTime;
    }

    /**
     * Gets the date and time that the air transport departs.
     * @return Date; the time the transportation departs.
     */
    public String getDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    /**
     * Sets the departure time of the air transportation.
     * @param departureTime Date; when the transportation departs. (add in the date format here)
     */
    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
