
/*
Lab #5 Part 2
Liam Coyle
Hayden Tuttle
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
        Train train = new Train("Locomotive", 60, "Ticket",
                40, 50, "2/22 2:30 PM", "91 School St. West Hempstead, NY 11552");
        Bike bike = new Bike("BMX", 20, "Rental",
                15, 1, "2/23 3:30 PM", "91 School St. West Hempstead, NY 11552");
        Bus bus = new Bus("Greyhound", 4, "Ticket",
                30, 15, "2/18 1:30 PM", "91 School St. West Hempstead, NY 11552");
        Automobile automobile = new Automobile("Subaru", 70, "Rental",
                40, 4, "2/21 1:00 PM", "91 School St. West Hempstead, NY 11552");

        // Air Options
        Dirigible dirigible = new Dirigible("Goodyear", 125, "Ticket",
                20, 20, "2/21 4:45 PM", "62 La Sierra Lane Ashburn, VA 20147");
        Helicopter helicopter = new Helicopter("Bell", 140, "Rental",
                40, 5, "2/24 3:30 PM", "62 La Sierra Lane Ashburn, VA 20147");
        Plane plane = new Plane("Boeing", 120, "Ticket",
                575, 60, "2/18 12:15 AM", "62 La Sierra Lane Ashburn, VA 20147");
        HotAirBalloon hotAirBalloon = new HotAirBalloon("Montgolfier", 70, "Rental",
                15, 4, "2/21 1:00 PM", "62 La Sierra Lane Ashburn, VA 20147");

        // Water Options
        Boat boat = new Boat("Bertram", 120, "Rental",
                25, 8, "2/20 4:30 PM", "4 West Bridle Street Evansville, IN 47711");
        Ship ship = new Ship("Evergreen", 200, "Ticket",
                21, 4500, "2/23 3:30 PM", "4 West Bridle Street Evansville, IN 47711");
        Submarine submarine = new Submarine("Subtech", 280, "Ticket", 16,
                7, "2/19 11:30 AM", "4 West Bridle Street Evansville, IN 47711");

        System.out.println("\n What type of transportation do you want to use?");
        train.displayTypeOptions();
        System.out.println("Pick [1-3]: ");

        int transportationTypeAnswer = input.nextInt();
        int transportationMethodAnswer = 0;
        switch (transportationTypeAnswer) {
            case 1:
                System.out.print("Land Selected \nOptions Available\n\n    ");
                train.tableLabelShort();
                System.out.println("[1] " + train.optionDisplay());
                System.out.println("[2] " + bike.optionDisplay());
                System.out.println("[3] " + bus.optionDisplay());
                System.out.println("[4] " + automobile.optionDisplay());

                System.out.print("\n Select method [1-4]: ");
                transportationMethodAnswer = input.nextInt();
                break;
            case 2:
                System.out.print("Air Selected \nOptions Available\n\n    ");
                dirigible.tableLabelShort();
                System.out.println("[1] " + dirigible.optionDisplay());
                System.out.println("[2] " + helicopter.optionDisplay());
                System.out.println("[3] " + plane.optionDisplay());
                System.out.println("[4] " + hotAirBalloon.optionDisplay());

                System.out.print("\n Select method [1-4]: ");
                transportationMethodAnswer = input.nextInt();
                break;
            case 3:
                System.out.print("Water Selected \nOptions Available\n\n    ");
                boat.tableLabelShort();
                System.out.println("[1] " + boat.optionDisplay());
                System.out.println("[2] " + ship.optionDisplay());
                System.out.println("[3] " + submarine.optionDisplay());

                System.out.print("\n Select method [1-3]: ");
                transportationMethodAnswer = input.nextInt();
                break;
        }
        
        //display total cost and travel instructions 
        double cost = -1;
        String instructionMessage = "";
        switch(transportationTypeAnswer) {
        case 1:
        	switch(transportationMethodAnswer) {
            case 1: cost = train.getCost();
            instructionMessage = "Goto the Train station at " + train.departureLocation + "\n by "
            + train.getDepartureTime() + "\n";
            	break;
            case 2: cost = bus.getCost();
            instructionMessage = "Goto the Bus station at " + bus.departureLocation + "\n by "
                    + bus.getDepartureTime() + "\n";
            	break;
            case 3: cost = bike.getCost();
            instructionMessage = "Goto the Bike rental at " + bike.departureLocation + "\n by "
                    + bike.getDepartureTime() + "\n";
            	break;
            case 4: cost = automobile.getCost();
            instructionMessage = "Get into your car that you left at " + automobile.departureLocation + "\n by "
                    + automobile.getDepartureTime() + "\n";
            	break;
            }
        	break;
        case 2:
        	switch(transportationMethodAnswer) {
            case 1: cost = dirigible.getCost();
            instructionMessage = "Goto the Dirigible... Place? at " + dirigible.departureLocation + "\n by "
                    + dirigible.getDepartureTime() + "\n";
            	break;
            case 2: cost = helicopter.getCost();
            instructionMessage = "Goto the Airport at " + helicopter.departureLocation + "\n by "
                    + helicopter.getDepartureTime() + "\n";
            	break;
            case 3: cost = plane.getCost();
            instructionMessage = "Goto the Airport at " + plane.departureLocation + "\n by "
                    + plane.getDepartureTime() + "\n";
            	break;
            case 4: cost = hotAirBalloon.getCost();
            instructionMessage = "Goto the Launch Zone at " + hotAirBalloon.departureLocation + "\n by "
                    + hotAirBalloon.getDepartureTime() + "\n";
            	break;
            }
        	break;
        case 3:
        	switch(transportationMethodAnswer) {
            case 1: cost = boat.getCost();
            instructionMessage = "Goto the Marina at " + boat.departureLocation + "\n by "
                    + boat.getDepartureTime() + "\n";
            	break;
            case 2: cost = ship.getCost();
            instructionMessage = "Goto the Marina at " + ship.departureLocation + "\n by "
                    + ship.getDepartureTime() + "\n";
            	break;
            case 3: cost = submarine.getCost();
            instructionMessage = "Goto the Submarine rental store at " + submarine.departureLocation + "\n by "
                    + submarine.getDepartureTime() + "\n";
            	break;
            }
        	break;
        }
        
        //TODO : when then number of passengers has been queried cost must be multiplied by number of passengers
        System.out.println();
        System.out.println("Total Cost: " + cost);
        //display travel instructions
        System.out.println();
        System.out.println("Travel Instructions");
        System.out.println(instructionMessage);
        
        
    }
}