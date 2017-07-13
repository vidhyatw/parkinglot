import java.util.Observable;
import java.util.Observer;

/**
 * Created by vidhyan on 13/07/17.
 */
public class ParkingLotOwner implements ParkingMessageSubscriber{
    boolean displayMessage = false;


    public void subscribeToParkingMessage(String message) {
        //System.out.print("ParkingLot Owner ---> " + message);
        displayMessage = true;
    }
}
