import java.util.Date;

public class Plane extends AirTransportation {

    public Plane(double cost, double averageSpeed,
                 String purchaseType, int numPassengers, String location, Date reservationTime) {
        super("Plane", cost, averageSpeed, purchaseType, numPassengers, location, reservationTime);
    }
    public Plane(double cost, double averageSpeed, String purchaseType, int numPassengers, String location) {
        super("Plane", cost, averageSpeed, purchaseType, numPassengers, location);
    }

    public String tableFormat() {
        return super.tableFormat();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
