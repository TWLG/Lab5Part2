 class Transportation {

    public void Transportation () {

    }

    public void displayTypeOptions() {
        System.out.println("[1] Land");
        System.out.println("[2] Air");
        System.out.println("[3] Water");
    }

     public void tableLabelShort() {
        //Prints a short label intended to use as a label for optionDisplay() table creation
         System.out.printf("%-14s%-8s%-16s%-16s%-8s", "Vehicle", "Price",
                 "Purchase Type", "Average Speed", "Capacity\n");
     }
}