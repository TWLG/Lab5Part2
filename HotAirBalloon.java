class HotAirBalloon extends LandTransportation {

    public HotAirBalloon(String type, double cost, String purchaseType, int avgSpeed, int capacity, String departureTime, String departureLocation) {
    	this.vehicleType = "HotAirBalloon";
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

    public String optionDisplay() {
        /* a shorter list of vehicle aspects
        */
        return String.format("%-14s%-8s%-16s%-16s%-12s", vehicleType, "$"+cost,
                purchaseType, avgSpeed + " mph", capacity);
    }
}