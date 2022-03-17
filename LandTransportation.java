class LandTransportation extends Transportation {
    public String transportationType = "Land";
    public int numTravelOptions = 4;
    public LandTransportation () {
    	super();
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