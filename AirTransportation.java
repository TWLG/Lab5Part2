class AirTransportation extends Transportation {
    public String transportationType = "Air";
    public int numTravelOptions = 4;
    public void AirTransportation () {
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