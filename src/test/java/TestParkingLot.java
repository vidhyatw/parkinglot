import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vidhyan on 13/07/17.
 */
public class TestParkingLot {

    @Test
    public void test_ParkCar(){
        ParkingLot lot = new ParkingLot(5);
        Car car = new Car();
        Assert.assertTrue(lot.park(car));
    }

    @Test
    public void test_UnparkCar(){
        ParkingLot lot = new ParkingLot(5);
        Car car = new Car();
        lot.park(car);
        Assert.assertTrue(lot.Unpark(car));
    }

    @Test
    public void test_IsParkingLotFull(){
        ParkingLot lot = new ParkingLot(2);
        Car car1 = new Car();
        lot.park(car1);
        Car car2 = new Car();
        lot.park(car2);
        boolean isFull=lot.isFull();
        Assert.assertTrue(isFull);
    }

}
