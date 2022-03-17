class AirTransportation extends Transportation {
    public String transportationType = "Air";
    public int numTravelOptions = 4;
    public String stationType = "Airport";
    public AirTransportation () {
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
    
    @Override
    public String getStationType() {
    	return stationType;
    }

}