
/*
Lab #5 Part 2
Liam Coyle
add your names plz

 */


/*
CHANGES TO HIERARCHY

Redesigned most of the structure of the lower classes to better fit the purpose, flexibility, and consistency
of the program.

Vehicle class changes
    (NEW)public String vehicleType = "";
    (CHANGED NAME)public int capacity;
    (CHANGED NAME)public String departureTime;
    (NEW)public String departureLocation;

    (NEW)set/get departureLocation();
    (NEW) @Override toString(); // Returns everything about the vehicle
    (NEW) optionDisplay(); // Returns important aspects of the vehicle in a shorter string

Transportation type class changes
    (NEW)public String transportationType = "Land";
    (CHANGED NAME)public int numTravelOptions = 4;

Transportation class changes
    (NEW)displayTypeOptions() //Prints out the three transportation types
    (NEW)tableLabelShort() // Prints a short label intended to use as a label for optionDisplay() table creation
*/

import java.util.Scanner;

public class TransportationDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vehicle data format
        // String type, double cost, String purchaseType, int avgSpeed, int capacity, String departureTime, String departureLocation

        // Land Options
        Train Train = new Train("Locomotive", 60, "Ticket",
                40, 50, "2/22 2:30 PM", "91 School St. West Hempstead, NY 11552");
        Bike Bike = new Bike("BMX", 20, "Rental",
                15, 1, "2/23 3:30 PM", "91 School St. West Hempstead, NY 11552");
        Bus Bus = new Bus("Greyhound", 4, "Ticket",
                30, 15, "2/18 1:30 PM", "91 School St. West Hempstead, NY 11552");
        Automobile Automobile = new Automobile("Subaru", 70, "Rental",
                40, 4, "2/21 1:00 PM", "91 School St. West Hempstead, NY 11552");

        // Air Options
        Dirigible Dirigible = new Dirigible("Goodyear", 125, "Ticket",
                20, 20, "2/21 4:45 PM", "62 La Sierra Lane Ashburn, VA 20147");
        Helicopter Helicopter = new Helicopter("Bell", 140, "Rental",
                40, 5, "2/24 3:30 PM", "62 La Sierra Lane Ashburn, VA 20147");
        Plane Plane = new Plane("Boeing", 120, "Ticket",
                575, 60, "2/18 12:15 AM", "62 La Sierra Lane Ashburn, VA 20147");
        HotAirBalloon HotAirBalloon = new HotAirBalloon("Montgolfier", 70, "Rental",
                15, 4, "2/21 1:00 PM", "62 La Sierra Lane Ashburn, VA 20147");

        // Water Options
        Boat Boat = new Boat("Bertram", 120, "Rental",
                25, 8, "2/20 4:30 PM", "4 West Bridle Street Evansville, IN 47711");
        Ship Ship = new Ship("Evergreen", 200, "Ticket",
                21, 4500, "2/23 3:30 PM", "4 West Bridle Street Evansville, IN 47711");
        Submarine Submarine = new Submarine("Subtech", 280, "Ticket", 16,
                7, "2/19 11:30 AM", "4 West Bridle Street Evansville, IN 47711");

        System.out.println("\n What type of transportation do you want to use?");
        Train.displayTypeOptions();
        System.out.println("Pick [1-3]: ");

        int transportationTypeAnswer = input.nextInt();
        int transportationMethodAnswer = 0;
        switch (transportationTypeAnswer) {
            case 1:
                System.out.print("Land Selected \nOptions Available\n\n    ");
                Train.tableLabelShort();
                System.out.println("[1] " + Train.optionDisplay());
                System.out.println("[2] " + Bike.optionDisplay());
                System.out.println("[3] " + Bus.optionDisplay());
                System.out.println("[4] " + Automobile.optionDisplay());

                System.out.print("\n Select method [1-4]: ");
                transportationMethodAnswer = input.nextInt();
                break;
            case 2:
                System.out.print("Air Selected \nOptions Available\n\n    ");
                Dirigible.tableLabelShort();
                System.out.println("[1] " + Dirigible.optionDisplay());
                System.out.println("[2] " + Helicopter.optionDisplay());
                System.out.println("[3] " + Plane.optionDisplay());
                System.out.println("[4] " + HotAirBalloon.optionDisplay());

                System.out.print("\n Select method [1-4]: ");
                transportationMethodAnswer = input.nextInt();
                break;
            case 3:
                System.out.print("Water Selected \nOptions Available\n\n    ");
                Boat.tableLabelShort();
                System.out.println("[1] " + Boat.optionDisplay());
                System.out.println("[2] " + Ship.optionDisplay());
                System.out.println("[3] " + Submarine.optionDisplay());

                System.out.print("\n Select method [1-3]: ");
                transportationMethodAnswer = input.nextInt();
                break;
        }
    }
}