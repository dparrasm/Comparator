public class UnregisteredCar extends Car implements TollGatePayable{
    public UnregisteredCar(String plate, String brand) {
        super(plate, brand);
    }

    @Override
    public int payTollGate() {
        return 3;
    }
}
