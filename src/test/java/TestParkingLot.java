import org.junit.Assert;
import org.junit.Test;

/**
 * Created by vidhyan on 13/07/17.
 */
public class TestParkingLot {

    @Test
    public void test_ParkCar(){
        ParkingLot lot = new ParkingLot();
        Car car = new Car();
        Assert.assertTrue(lot.park(car));
    }

    @Test
    public void test_UnparkCar(){
        ParkingLot lot = new ParkingLot();
        Car car = new Car();
        Assert.assertTrue(lot.Unpark(car));
    }

}
