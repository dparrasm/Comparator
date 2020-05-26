public final class UnregisteredTruck extends Truck implements TollGatePayable{
    public UnregisteredTruck(String plate,String brand) {
        super(plate, brand);
    }
    @Override
    public int payTollGate() {
        return 5;
    }
}
