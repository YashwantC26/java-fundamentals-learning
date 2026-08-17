class Vehicle {
    int passengers;
    double fuelCapacity;
    double mpg;
    String name;

    Vehicle (int passengers, double fuelCapacity, double mpg, String name) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
        this.name = name;
    }
    int calculateRange() {
        return (int) (fuelCapacity * mpg);
    }

    double fuelNeeded(double miles) {
        return (short) miles / this.mpg;
    }

    void displayInfo() {
        System.out.println(this.name + " | fuel capacity: " + this.fuelCapacity + " | overall range: " +
                this.calculateRange() + " | trip fuel needed: " + this.fuelNeeded(500));
    }

}


class VehicleInfo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 20, 17, "Minivan");
        Vehicle sportsCar = new Vehicle(2, 14, 13, "Sports Car");
        Vehicle truck = new Vehicle(2, 30, 25, "Truck");

        Vehicle[] fleet = {minivan, sportsCar, truck};

        for(Vehicle vehicle : fleet) {
            vehicle.displayInfo();
        }


    }
}