import java.util.*;

/**
 * Created by vidhyan on 13/07/17.
 */
public class ParkingLot {

    private final int parkingLotSize;
    private final Set< Car> parkingSlots;
    private List <ParkingMessageSubscriber> parkingMessageSubscribers;

    public ParkingLot(int parkingLotSize) {

        this.parkingLotSize = parkingLotSize;

        parkingSlots = new HashSet<Car>();
        parkingMessageSubscribers = new ArrayList<ParkingMessageSubscriber>();

    }

    public boolean subscribeParkingLotMessages(ParkingMessageSubscriber subscriber) {
        parkingMessageSubscribers.add(subscriber);
        return true;
    }


    public boolean unpark(Car car) {


        boolean unpark = parkingSlots.remove(car);
        if(unpark) {
            notifyParkingMessageSubscribers();

        }
        return unpark;

    }


    public boolean park( Car car){

        if (isFull()) {
            return false;
        }


        boolean slotAssigned =  parkingSlots.add(car);
        notifyParkingMessageSubscribers();

        return slotAssigned;
    }

    public boolean isFull() {
        return parkingSlots.size() == parkingLotSize;
    }

    public boolean wasFull() {return parkingSlots.size() + 1 == parkingLotSize; }

    public void notifyParkingMessageSubscribers( ) {

        if (isFull()) {
            notifyEachSubscriber("Parking lot is full");
        }

        else if(wasFull()) {
            notifyEachSubscriber("Parking is available");

        }
    }

    private void notifyEachSubscriber(String message) {
        for (ParkingMessageSubscriber subscriber : parkingMessageSubscribers) {
            subscriber.subscribeToParkingMessage(message);
        }

    }
}
