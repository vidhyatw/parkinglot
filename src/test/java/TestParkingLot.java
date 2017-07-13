import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by vidhyan on 13/07/17.
 */
public class TestParkingLot {

    private ParkingLot lot;
    private Car car1,car2, car3, car4;
    ParkingLotOwner owner;
    SecurityStaff securityStaff;

    @Before
    public void setup() {
        owner = new ParkingLotOwner();
        securityStaff = new SecurityStaff();

        lot = new ParkingLot(3);
        lot.subscribeParkingLotMessages(owner);
        lot.subscribeParkingLotMessages(securityStaff);

        car1 = new Car("1#");
        car2 = new Car("2#");
        car3 = new Car("3#");
        car4 = new Car("4#");
    }

    @Test
    public void test_ParkCar(){

        Assert.assertTrue(lot.park(car1));
    }

    @Test
    public void test_DoNotParkCar_WhenLotIsFull(){
        Assert.assertTrue(lot.park(car1));
        Assert.assertTrue(lot.park(car2));
        lot.park(car3);
        Assert.assertFalse(lot.park(car4));
    }

    @Test
    public void test_ParkAParkedCar(){
        lot.park(car1);
        Assert.assertFalse(lot.park(car1));

    }

    @Test
    public void test_UnparkCar(){
        lot.park(car1);
        Assert.assertTrue(lot.unpark(car1));
    }

    @Test
    public void test_UnparkAnUnparkedCar(){
        Assert.assertTrue(lot.park(car1));
        Assert.assertTrue(lot.unpark(car1));
        Assert.assertFalse(lot.unpark(car1));
    }

    @Test
    public void test_IsParkingLotFull(){
        lot.park(car1);
        lot.park(car2);
        lot.park(car3);
        lot.park(car4);
        Assert.assertTrue(lot.isFull());
    }

    @Test
    public void test_IsParkingAvailable(){
        lot.park(car1);
        Assert.assertFalse(lot.isFull());
    }

    @Test
    public void test_NotifyOwnerWhenLotIsFull(){
        owner.displayMessage = false;
        lot.park(car1);
        lot.park(car2);
        lot.park(car3);
        Assert.assertTrue(owner.displayMessage);
    }

    @Test
    public void test_NotifySecurityWhenLotIsFull(){
        securityStaff.displayMessage = false;
        lot.park(car1);
        lot.park(car2);
        lot.park(car3);
        Assert.assertTrue(securityStaff.displayMessage);
    }
}
