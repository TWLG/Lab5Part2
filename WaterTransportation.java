class WaterTransportation extends Transportation {
    public String transportationType = "Water";
    public int numTravelOptions = 3;
    public void WaterTransportation () {
    }

    // Mutators
    public void setTransportationType(int numTravelOptions) {
        this.numTravelOptions = numTravelOptions;
    }

    // Accessors
    public int getNumTravelOptions() {
        return this.numTravelOptions;
    }

}