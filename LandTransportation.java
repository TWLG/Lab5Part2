class LandTransportation extends Transportation {
    // instance variables  
    public String transportationType = "Land";
    public static int numTravelOptions = 4;
    
    // constructor
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
