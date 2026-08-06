import java.util.Scanner;

class Information {
    void getInfo() {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        double hourlyWage = 0;
        double targetHours = 0;
        System.out.println("What is your name: ");
        String name = scanner.nextLine();

        System.out.println("What is your age: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Please input an number: ");
            scanner.next();
        } age = scanner.nextInt();


        System.out.println("What is your hourly wage: ");

        while(!scanner.hasNextDouble()) {
            System.out.println("Please input a valid wage: ");
            scanner.next();
        } hourlyWage = scanner.nextDouble();


        System.out.println("What are your target work hours: ");

        while(!scanner.hasNextDouble()) {
            System.out.println("Please input valid work hours:");
            scanner.next();
        } targetHours = scanner.nextDouble();
        scanner.close();
        double weeklyWages = hourlyWage * targetHours;

        System.out.println("""
                   ==============================
                       User Profile Generator
                   ==============================""");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hourly Wage: " + hourlyWage);
        System.out.println("Work Hours: " + targetHours);
        System.out.println("Est. Weekly $$: " + weeklyWages);
        System.out.println("""
                   ------------------------------
                         Profile Generated
                   ------------------------------""");
    }
}


class UserProfile {
    public static void main(String[] args) {
        Information obtainInfo = new Information();
        obtainInfo.getInfo();

    }
}