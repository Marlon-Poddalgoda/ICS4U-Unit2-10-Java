/**
 * This is the class file is for the Truck Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-05-28
 */

public class Truck extends Vehicle {
    // Class for truck

    // fields
    /**
    * Current speed.
    */
    private String licenseNum;
    /**
    * Current air level.
    */
    private int pressurizedAir;
    /**
    * Number of wheels.
    */
    private final int numOfWheels = 18;

    // constructor
    /**
    * This contructor creates a base truck.
    * @param inputLicense This is the inputted license.
    * @param inputColour This is the inputted colour.
    * @param inputPassengers This is the inputted passengers.
    */
    public Truck(final String inputLicense, final String inputColour,
                                            final int inputPassengers) {
        super(inputColour, inputPassengers);
        this.licenseNum = inputLicense;
        this.pressurizedAir = 0;
    }

    //getters
    /**
    * This getter returns the license plate number.
    * @return licenseNum This is the license number.
    */
    public String getLicense() {
        return licenseNum;
    }

    /**
    * This getter returns the number of wheels.
    * @return numOfWheels This is the number of wheels.
    */
    public int getWheels() {
        return numOfWheels;
    }

    //setters
    /**
    * This setter sets the license plate number.
    * @param inputLicense This is the license number.
    */
    public void setLicense(final String inputLicense) {
        this.licenseNum = inputLicense;
    }

    // methods
    /**
    * This method provides compressed air.
    * @param inputAir This is the input air.
    * @return pressurizedAir This is the air level.
    */
    public int provideAir(final int inputAir) {
        // adds air to system
        this.pressurizedAir += inputAir;
        return pressurizedAir;
    }
}
