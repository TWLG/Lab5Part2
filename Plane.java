class Plane extends LandTransportation {
    public String vehicleType = "Plane";
    public String type;
    public double cost;
    public String purchaseType;
    public int avgSpeed;
    public int capacity;
    public String departureTime;
    public String departureLocation;

    public Plane(String type, double cost, String purchaseType, int avgSpeed, int capacity, String departureTime, String departureLocation) {
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
        return String.format("%-14s%-8s%-16s%-16s%-12s", vehicleType, "$"+cost,
                purchaseType, avgSpeed + " mph", capacity);
    }

    // Mutators
    public void setType(String type) {
        this.type = type;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public void setAvgSpeed(int avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    // Accessors
    public String getType() {
        return this.type;
    }

    public double getCost() {
        return this.cost;
    }

    public String getPurchaseType() {
        return this.purchaseType;
    }

    public int getAvgSpeed() {
        return this.avgSpeed;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getDepartureTime(String departureTime) {
        return this.departureTime;
    }

    public String getDepartureLocation(String departureLocation) {
        return this.departureLocation;
    }
}