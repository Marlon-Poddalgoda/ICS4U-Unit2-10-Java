/**
 * This is the class file is for the Bike Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-28
 */

public class Bike extends Vehicle {
    // Class for bike

    // fields
    /**
    * Cadence (rpm).
    */
    private double cadence;
    /**
    * Number of wheels.
    */
    private final int numOfWheels = 2;
    /**
    * radius of wheel.
    */
    private final int radius = 12;


    // constructor
    /**
    * This contructor creates a base bike.
    * @param inputColour This is the inputted colour.
    * @param inputPassengers This is the inputted passengers.
    */
    public Bike(final String inputColour, final int inputPassengers) {
        super(inputColour, inputPassengers);
        this.cadence = 0;
    }

    // getters
    /**
    * This getter returns the number of wheels.
    * @return numOfWheels This is the number of wheels.
    */
    public int getWheels() {
        return numOfWheels;
    }

    // methods
    /**
    * This method calculates the bike cadence.
    * @return cadenceInt This is the candece.
    */
    public int calcCadence() {
        // made up formula to convert speed to cadence

        this.cadence = ((getSpeed() * getSpeed()) / radius * 2);
        int cadenceInt = (int) cadence;
        return cadenceInt;
    }

    /**
    * This method rings the bell.
    */
    public void ringBell() {
        // prints out to the console
        System.out.println("Ding!");
    }
}
