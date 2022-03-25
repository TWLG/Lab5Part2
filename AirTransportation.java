class AirTransportation extends Transportation {
    // instance variables
    public String transportationType = "Air";
    public static int numTravelOptions = 4;
    public String stationType = "Airport";
    
    // constructor  
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
