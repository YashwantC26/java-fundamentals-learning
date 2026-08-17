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
}


class VehicleInfo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7, 20, 17);
        Vehicle sportsCar = new Vehicle(2, 14, 13);
        Vehicle truck = new Vehicle(2, 30, 25);


        int minivanRange = minivan.calculateRange();
        int sportsCarRange = sportsCar.calculateRange();
        int truckRange = truck.calculateRange();

        double minivanFuel = minivan.fuelNeeded(500);
        double sportsCarFuel = sportsCar.fuelNeeded(500);
        double truckFuel = truck.fuelNeeded(500);

        System.out.println("""
                The following are the stats for each vehicle:
                ---------------------------------------------"""
        );
        System.out.println("Minivan | fuel capacity: " + minivan.fuelCapacity + " | overall range: " + minivanRange +
                " | trip fuel needed: " + minivanFuel);

        System.out.println("Sports Car | fuel capacity: " + sportsCar.fuelCapacity + " | overall range: " + sportsCarRange +
                " | trip fuel needed: " + sportsCarFuel);

        System.out.println("Truck | fuel capacity: " + truck.fuelCapacity + " | overall range: " + truckRange +
                " | trip fuel needed: " + truckFuel);
    }
}