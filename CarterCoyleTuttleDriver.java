
/*
Lab #5 Part 2
Liam Coyle
Hayden Tuttle
Randee Carter

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

public class CarterCoyleTuttleDriver {

    public static Transportation[] modes;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        modes = new Transportation[111];
        // Vehicle data format
        // String type, double cost, String purchaseType, int avgSpeed, int capacity, String departureTime, String departureLocation

        // Land Options
        modes[0] = new Train("Locomotive", 60, "Ticket",
                40, 50, "2/22 2:30 PM", "91 School St. West Hempstead, NY 11552");
        modes[1] = new Bike("BMX", 20, "Rental",
                15, 1, "2/23 3:30 PM", "91 School St. West Hempstead, NY 11552");
        modes[2] = new Bus("Greyhound", 4, "Ticket",
                30, 15, "2/18 1:30 PM", "91 School St. West Hempstead, NY 11552");
        modes[3] = new Automobile("Subaru", 70, "Rental",
                40, 4, "2/21 1:00 PM", "91 School St. West Hempstead, NY 11552");

        // Air Options
        modes[4] = new Dirigible("Goodyear", 125, "Ticket",
                20, 20, "2/21 4:45 PM", "62 La Sierra Lane Ashburn, VA 20147");
        modes[5] = new Helicopter("Bell", 140, "Rental",
                40, 5, "2/24 3:30 PM", "62 La Sierra Lane Ashburn, VA 20147");
        modes[6] = new Plane("Boeing", 120, "Ticket",
                575, 60, "2/18 12:15 AM", "62 La Sierra Lane Ashburn, VA 20147");
        modes[7] = new HotAirBalloon("Montgolfier", 70, "Rental",
                15, 4, "2/21 1:00 PM", "62 La Sierra Lane Ashburn, VA 20147");

        // Water Options
        modes[8] = new Boat("Bertram", 120, "Rental",
                25, 8, "2/20 4:30 PM", "4 West Bridle Street Evansville, IN 47711");
        modes[9] = new Ship("Evergreen", 200, "Ticket",
                21, 4500, "2/23 3:30 PM", "4 West Bridle Street Evansville, IN 47711");
        modes[10] = new Submarine("Subtech", 280, "Ticket", 16,
                7, "2/19 11:30 AM", "4 West Bridle Street Evansville, IN 47711");

        System.out.println("\nWhat type of transportation do you want to use?");
        Transportation.displayTypeOptions();

        int transportationTypeAnswer = input.nextInt();
        int transportationMethodAnswer = 0;
        Transportation[] subOptions;
        int subOptionsIndex = 0;
        Transportation toUse = null;

        boolean confirmedAnswer = false;
        int subOptionsIndexTemp;

        switch (transportationTypeAnswer) {
            case 1:
                System.out.print("Land Selected \n\nOptions Available\n");
                subOptions = new Transportation[LandTransportation.numTravelOptions];
                while (confirmedAnswer == false) {
                    subOptionsIndexTemp = subOptionsIndex;

                    //spacing fix
                    System.out.print("    ");
                    Transportation.tableLabelShort();
                    for (int i = 0; i < modes.length; i++) {
                        if (modes[i] instanceof LandTransportation) {
                            System.out.println("[" + (subOptionsIndexTemp + 1) + "] " + modes[i].optionDisplay());
                            subOptions[subOptionsIndexTemp] = modes[i];
                            subOptionsIndexTemp++;
                        }
                    }

                    System.out.print("\n Select method [#]: ");
                    transportationMethodAnswer = input.nextInt();
                    toUse = subOptions[transportationMethodAnswer - 1];

                    System.out.print("\nAre you sure you want to use: \n");
                    Transportation.tableLabelFull();
                    System.out.println("\n" + toUse.optionDisplayFull());

                    System.out.print("\n[1] Yes \n[2] No \n");
                    System.out.print("Enter: ");
                    int transportationMethodConfirm = input.nextInt();
                    switch (transportationMethodConfirm) {
                        case 1:
                            confirmedAnswer = true;
                            System.out.print("\nAnswer confirmed for: " + toUse.getVehicleType() + "\n");
                            break;
                        case 2:
                            confirmedAnswer = false;
                            System.out.print("\nChoose another method [#]: \n");
                            break;

                    }
                }
                break;
            case 2:
                System.out.print("Air Selected \n\nOptions Available\n");
                subOptions = new Transportation[AirTransportation.numTravelOptions];

                while (confirmedAnswer == false) {
                    subOptionsIndexTemp = subOptionsIndex;

                    //spacing fix
                    System.out.print("    ");
                    Transportation.tableLabelShort();
                    for (int i = 0; i < modes.length; i++) {
                        if (modes[i] instanceof AirTransportation) {
                            System.out.println("[" + (subOptionsIndexTemp + 1) + "] " + modes[i].optionDisplay());
                            subOptions[subOptionsIndexTemp] = modes[i];
                            subOptionsIndexTemp++;
                        }
                    }

                    System.out.print("\n Select method [#]: ");
                    transportationMethodAnswer = input.nextInt();
                    toUse = subOptions[transportationMethodAnswer - 1];

                    System.out.print("\nAre you sure you want to use: \n");
                    Transportation.tableLabelFull();
                    System.out.println("\n" + toUse.optionDisplayFull());

                    System.out.print("\n[1] Yes \n[2] No \n");
                    System.out.print("Enter: ");
                    int transportationMethodConfirm = input.nextInt();
                    switch (transportationMethodConfirm) {
                        case 1:
                            confirmedAnswer = true;
                            System.out.print("\nAnswer confirmed for: " + toUse.getVehicleType() + "\n");
                            break;
                        case 2:
                            confirmedAnswer = false;
                            System.out.print("\nChoose another method [#]: \n");
                            break;

                    }
                }
                break;

            case 3:

                System.out.print("Water Selected \n\nOptions Available\n");
                subOptions = new Transportation[WaterTransportation.numTravelOptions];

                while (confirmedAnswer == false) {
                    subOptionsIndexTemp = subOptionsIndex;

                    //spacing fix
                    System.out.print("    ");
                    Transportation.tableLabelShort();
                    for (int i = 0; i < modes.length; i++) {
                        if (modes[i] instanceof WaterTransportation) {
                            System.out.println("[" + (subOptionsIndexTemp + 1) + "] " + modes[i].optionDisplay());
                            subOptions[subOptionsIndexTemp] = modes[i];
                            subOptionsIndexTemp++;
                        }
                    }

                    System.out.print("\nSelect method [#]: ");
                    transportationMethodAnswer = input.nextInt();
                    toUse = subOptions[transportationMethodAnswer - 1];

                    System.out.print("\nAre you sure you want to use: \n");
                    Transportation.tableLabelFull();
                    System.out.println("\n" + toUse.optionDisplayFull());

                    System.out.print("\n[1] Yes \n[2] No \n");
                    System.out.print("Enter: ");
                    int transportationMethodConfirm = input.nextInt();
                    switch (transportationMethodConfirm) {
                        case 1:
                            confirmedAnswer = true;
                            System.out.print("\nAnswer confirmed for: " + toUse.getVehicleType() + "\n");
                            break;
                        case 2:
                            confirmedAnswer = false;
                            System.out.print("\nChoose another method [#]: \n");
                    }
                }
                break;
        }

        int numberOfPassengers = 1;


        System.out.print("Number of passengers: ");
        numberOfPassengers = input.nextInt();
        //display cost
        if (toUse.getPurchaseType() == "Ticket") {
            System.out.println("Total Cost: $" + toUse.getCost() * numberOfPassengers);
        } else if (toUse.getPurchaseType() == "Rental") {

            int rentalsNeeded = numberOfPassengers / toUse.getCapacity();
            if (numberOfPassengers % toUse.getCapacity() > 0) {
                rentalsNeeded += 1;
            }
            System.out.println("Rentals needed: " + rentalsNeeded);
            System.out.println("Total Cost: $" + toUse.getCost() * rentalsNeeded);

        }

        //display travel instructions
        System.out.println();
        System.out.println("Travel Instructions:");
        System.out.println("Type: " + toUse.getStationType()
                + "\nLocation: " + toUse.getDepartureLocation()
                + "\nDeparture Time: " + toUse.getDepartureTime()
                + "\nVehicle Brand: " + toUse.getVehicleType());


    }
}
