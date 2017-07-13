/**
 * Created by vidhyan on 13/07/17.
 */
public class Slot {
    private int slotNumber;
    private Car slotAssign;

    public boolean assign(Car car) {
        this.slotAssign = car;
        return true;
    }


}
