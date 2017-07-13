/**
 * Created by vidhyan on 13/07/17.
 */
public class SecurityStaff implements ParkingMessageSubscriber {
    boolean displayMessage = false;

    public void subscribeToParkingMessage(String message) {
        //System.out.println("Security ---> " + message);
        displayMessage = true;
    }
}
