class WaterTransportation extends Transportation {
    public String transportationType = "Water";
    public static int numTravelOptions = 3;
    public String stationType = "Marina";
    
    public WaterTransportation () {
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