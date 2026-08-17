class Vehicle {
    int passengers;
    double fuelCapacity;
    double mpg;

    Vehicle (int passengers, double fuelCapacity, double mpg) {
        this.passengers = passengers;
        this.fuelCapacity = fuelCapacity;
        this.mpg = mpg;
    }
    int calculateRange() {
        return (int) (fuelCapacity * mpg);
    }

    double fuelNeeded(double miles) {
        return (short) miles / this.mpg;
    }

    void displayInfo(String name) {
        System.out.println(name + " | fuel capacity: " + this.fuelCapacity + " | overall range: " +
                this.calculateRange() + " | trip fuel needed: " + this.fuelNeeded(500));
    }

}


class VehicleInfo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 20, 17);
        Vehicle sportsCar = new Vehicle(2, 14, 13);
        Vehicle truck = new Vehicle(2, 30, 25);

        minivan.displayInfo("minivan");
        sportsCar.displayInfo("Sports Car");


    }
}