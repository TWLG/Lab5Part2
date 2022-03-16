class LandTransportation extends Transportation {
    public String transportationType = "Land";
    public int numTravelOptions = 4;
    public void LandTransportation () {
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