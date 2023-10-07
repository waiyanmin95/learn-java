package section1.exe7;

public class Exec7Car {
    private String make;
    private String model;

    private String category;

    private String color;

    private String fuel;

    public Exec7Car(String make, String model, String category, String color, String fuel) {
        this.make = make;
        this.model = model;
        this.category = category;
        this.color = color;
        this.fuel = fuel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Exec7Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", category='" + category + '\'' +
                ", color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Exec7Car carA = new Exec7Car("Ford", "Everest", "SUV", "White", "Diesel"); // Create Instance
        Exec7Car carB = new Exec7Car("Suzuki", "Ciaz", "Sedan", "Black", "Gasoline");
        System.out.println(carA);
        System.out.println(carB);
        carB.setColor("Purple");
        System.out.println("Car B Color: "+carB.getColor());
    }
}
