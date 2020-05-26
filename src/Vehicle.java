import java.util.Objects;

public abstract class Vehicle {
    private static int count = 0;
    private final long ID;
    private String brand;
    private int gaz;
    public String plate;

    public Vehicle(String plate, String brand){
        this.ID = count++;
        this.gaz = 100;
        this.brand = brand;
        this.plate = plate;
    }
    public Vehicle(String plate){
        this.ID = count++;
        this.gaz = 100;
        this.brand = "Peugeot";
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ID=" + ID +
                ", brand='" + brand + '\'' +
                ", gaz=" + gaz +
                ", plate='" + plate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return plate.equals(vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }
}
