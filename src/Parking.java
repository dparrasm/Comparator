import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;


public class Parking<T> implements Comparable{
    private String code;
    private String name;
    public List<T> vehicles;
    public List<TollGate> tollGateList;

    public int calculateTotalPrice(){
        int total = 0;
        for(int i = 0; i < this.vehicles.size(); i++){
            if(this.vehicles.get(i) instanceof UnregisteredCar)
                total += ((UnregisteredCar) this.vehicles.get(i)).payTollGate();

            if(this.vehicles.get(i) instanceof UnregisteredTruck)
                total += ((UnregisteredTruck) this.vehicles.get(i)).payTollGate();

        }
        return total;
    }

    public void add(T vehicle){
        this.vehicles.add(vehicle);

    }

    @Override
    public String toString() {
        return name;
    }

    public Parking(String name, String code){
        this.code = code;
        this.name = name;
        this.vehicles = new ArrayList<T>();
        this.tollGateList = new ArrayList<TollGate>();
    }

    @Override
    public int compareTo(Object o) {
        Parking parking = (Parking) o;
        if(this.vehicles.size() > parking. vehicles.size()){
            return -1;
        }else if (this.vehicles.size() < parking.vehicles.size()){
            return 1;
        }else{
            return 0;
        }
    }

    public class TollGate {
        public String id;
        public boolean enable = true;
        public Orientation orientation;
        public Direction direction;

        public TollGate(Direction direction,Orientation orientation){
            this.id = "door-" + Parking.this.tollGateList.size();
            this.direction = direction;
            this.orientation = orientation;
            System.out.println("--Gate: " + Parking.this.code + "#" + this.id);
        }
    }

}
