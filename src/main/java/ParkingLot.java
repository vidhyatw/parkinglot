/**
 * Created by vidhyan on 13/07/17.
 */
public class ParkingLot {

    public Slot getEmptySlot() {
        return new Slot();
    }

    public boolean park(Car car){
        Slot s = getEmptySlot();
        boolean assigned = s.assign(car);
        return assigned;
    }
}
