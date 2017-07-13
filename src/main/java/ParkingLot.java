import java.util.*;

/**
 * Created by vidhyan on 13/07/17.
 */
public class ParkingLot {

    private int parkingLotSize;


    private List< Car> slotList;

    public ParkingLot(int parkingLotSize) {

        this.parkingLotSize = parkingLotSize;

        slotList = new ArrayList<Car>();

    }


    public boolean park( Car car){

        boolean assigned = assignSlot(car);
        return assigned;
    }

    public boolean Unpark( Car car) {

        return slotList.remove(car);

    }


    private boolean assignSlot(Car car) {


        if (isFull()) {
            return false;
        }

        slotList.add(car);
        return true;
    }

    public boolean isFull() {
        return slotList.size() == parkingLotSize;
    }


}
