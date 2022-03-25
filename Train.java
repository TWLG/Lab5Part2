class Train extends LandTransportation {
    
    // constructor
    public Train(String type, double cost, String purchaseType, int avgSpeed, int capacity, String departureTime, String departureLocation) {
    	super();
    	this.vehicleType = "Train";
        this.type = type;
        this.cost = cost;
        this.purchaseType = purchaseType;
        this.avgSpeed = avgSpeed;
        this.capacity = capacity;
        this.departureTime = departureTime;
        this.departureLocation = departureLocation;
    }

    @Override
    public String toString() {
        return String.format("%-8s%-12s%-8s%-12s%-8s%-8s%-18s%-25s", vehicleType, type, "$"+cost,
                purchaseType, avgSpeed + " mph", capacity,
                departureTime, departureLocation);
    }


    
    @Override
    public String getStationType() {
    	return "Train Station";
    }
}
