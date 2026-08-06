import java.util.Scanner;

class Information {
    Scanner scanner = new Scanner(System.in);

    void genProfile() {
        System.out.println("Generate User Profile? yes/no ");
        String response = scanner.nextLine();

        while(!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
            System.out.println("Choose yes/no: ");
            response = scanner.nextLine();
        }
        if (response.equalsIgnoreCase("yes")) {
            getInfo();
        } else System.out.println("Exiting...");
    }
    void getInfo() {

        int age;
        double hourlyWage;
        double targetHours;
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

        scanner.next();

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

        obtainInfo.genProfile();
    }
}