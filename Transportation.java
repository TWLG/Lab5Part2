class Transportation {

	// instance variables		
    public String type;
    public String vehicleType;
    public double cost;
    public String purchaseType;
    public int avgSpeed;
    public int capacity;
    public String departureTime;
    public String departureLocation;

	// constructor
    public void Transportation() {

    }
    /**
     * displays choices for land, air or water options for user
     */
    public static void displayTypeOptions() {
        System.out.println("[1] Land"
                + "\n[2] Air"
                + "\n[3] Water");
        System.out.print("Pick [1-3]: ");
    }

    public String optionDisplay() {
        /* a shorter list of vehicle aspects
         */
        return String.format("%-14s%-13s%-8s%-16s%-16s%-12s", vehicleType, type, "$" + cost,
                purchaseType, avgSpeed + " mph", capacity);
    }

    public static void tableLabelShort() {
        //Prints a short label intended to use as a label for optionDisplay() table creation
        System.out.printf("%-14s%-13s%-8s%-16s%-16s%-8s", "Vehicle", "Type", "Price",
                "Purchase Type", "Average Speed", "Capacity\n");
    }

    public String optionDisplayFull() {
	 /* a list of vehicle aspects
	  */
        return String.format("%-14s%-12s%-8s%-16s%-16s%-12s%-20s%-10s", vehicleType, type, "$" + cost,
                purchaseType, avgSpeed + " mph", capacity, departureTime, departureLocation);
    }

    public static void tableLabelFull() {
        //Prints a short label intended to use as a label for optionDisplay() table creation
        System.out.printf("%-14s%-12s%-8s%-16s%-16s%-12s%-20s%-10s", "Vehicle", "Type", "Price",
                "Purchase Type", "Average Speed", "Capacity", "Departure Time", "Departure Location");
    }

    /**
     * @return the name of the station
     */
    public String getStationType() {
        return "Not Set";
    }

    /**
     * @return the vehicleType
     */
    public String getVehicleType() {
        return vehicleType;
    }

    /**
     * @param vehicleType the vehicleType to set
     */
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the cost
     */
    public double getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @return the purchaseType
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * @param purchaseType the purchaseType to set
     */
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    /**
     * @return the avgSpeed
     */
    public int getAvgSpeed() {
        return avgSpeed;
    }

    /**
     * @param avgSpeed the avgSpeed to set
     */
    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * @return the departureLocation
     */
    public String getDepartureLocation() {
        return departureLocation;
    }

    /**
     * @param departureLocation the departureLocation to set
     */
    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

}
