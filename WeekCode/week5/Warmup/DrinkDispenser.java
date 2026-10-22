// DrinkDispenser class that does methods relating to the drinks
public class DrinkDispenser {

    public void checkSyrup() { // Method to check if syrup levels are good
        double syrup_level;
        int rounded_syrup_level;
        syrup_level = Math.random() * 100;
        rounded_syrup_level = (int)(Math.round(syrup_level * 100)/100.0);
        if (syrup_level >= 30) {
            System.out.println("Syrup levels are at "+ rounded_syrup_level +"%, all good!");
        } else {
            System.out.println("WARNING! Syrup levels are at "+ rounded_syrup_level +"%! Critical level!");
        }

    }

    public void checkIce() { // Method to check if the ice bin is full
        int ice_weight;
        ice_weight = (int)(Math.random() * 51);
        if (ice_weight >= 15) {
            System.out.println("The ice weight is "+ ice_weight +". The ice bin is full.");
        } else {
            System.out.println("WARNING! The ice weight is "+ ice_weight +"! The ice bin is low.");
        }
    }

    public void numDrinks() { // Method to check to drinks
        int drinks;
        drinks = (int)(Math.random() * 10) + 1;

        if (drinks >= 4) {
            System.out.println("There are "+ drinks +" drinks, you will need a drink carrier");
        } else {
            System.out.println("The are "+ drinks +" drinks");
        }
    }

}
