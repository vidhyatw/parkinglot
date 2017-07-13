/**
 * Created by vidhyan on 13/07/17.
 */
public class Car {

    private String carRegistrationNo;

    public Car(String regNo) {
        this.carRegistrationNo = regNo;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Car ) {
            return this.carRegistrationNo.equals(((Car)obj).carRegistrationNo);
        }
        return false;
    }
}
