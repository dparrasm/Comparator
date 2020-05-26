import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle v0 = new RegisteredCar("123213","Peugeot");
        Vehicle v1 = new UnregisteredCar("000000","Peugeot");
        Vehicle v2 = new UnregisteredTruck("002233","Peugeot");
        Vehicle v3 = new RegisteredTruck("111111","Peugeot");

        Car c0 = new RegisteredCar("333222","Peugeot");
        Car c1 = new RegisteredCar("666666","Peugeot");
        Car c2 = new UnregisteredCar("666777","Peugeot");

        Truck t1 = new RegisteredTruck("555666","Peugeot");
        Truck t2 = new RegisteredTruck("777888","Peugeot");

        Parking<Vehicle> p1 = new Parking<Vehicle>("Jean Jaures Public", "JJP");
        p1.add(v0);
        p1.add(v1);
        p1.add(v2);
        p1.add(v3);

        Parking<Car> p2 = new Parking<Car>("Jean Jaures Car", "JJC");
        p2.add(c0);
        p2.add(c1);
        p2.add(c2);

        Parking<Truck> p3 = new Parking<Truck>("Jean Jaures Truck", "JJT");
        p3.add(t1);
        p3.add(t2);


        List<Parking> parkingList = Arrays.asList(p3,p2,p1);
        System.out.println("Default order:");
        for (Parking p: parkingList){
            System.out.println(p);
        }

        Collections.sort(parkingList, (Parking o1, Parking o2) -> {
            if(o1.vehicles.size() > o2.vehicles.size()){
                return -1;
            }else if (o1.vehicles.size() < o2.vehicles.size()){
                return 1;
            }else{
                return 0;
            }
        });


        System.out.println("Sorting using Collections.sort:");
        for (Parking p: parkingList){
            System.out.println(p + " - " + p.vehicles.size());
        }
    }
}
