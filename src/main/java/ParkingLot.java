/**
 * Created by vidhyan on 13/07/17.
 */
public class ParkingLot {

    private Slot getEmptySlot() {
        return new Slot();
    }

    public boolean park( Car car){
        Slot s = getEmptySlot();
        boolean assigned = s.assign(car);
        return assigned;
    }

    public boolean Unpark( Car car) {
        Slot s = getSlotOfParkedCar(car);
        boolean release = s.unassign(car);
        return release;
    }

    private Slot getSlotOfParkedCar(Car car) {
        return new Slot();
    }
}
