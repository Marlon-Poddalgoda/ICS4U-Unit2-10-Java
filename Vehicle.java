/**
 * This is the class file is for the Vehicle Class.
 *
 * @author  Marlon Poddalgoda
 * @version 1.0
 * @since 2021-06-01
 */

abstract class Vehicle {
    // Class for Vehicle

    // fields
    /**
    * Colour.
    */
    private String colour;
    /**
    * Speed.
    */
    private int speed;
    /**
    * Max Speed.
    */
    private final int maxSpeed = 120;
    /**
    * numOfPassengers.
    */
    private final int numOfPassengers;

    // constructor
    /**
    * This contructor creates a base vehicle.
    * @param inputColour This is the inputted colour.
    * @param inputPassengers This is the inputted passengers.
    */
    public Vehicle(final String inputColour, final int inputPassengers) {
        this.numOfPassengers = inputPassengers;
        this.colour = inputColour;
        this.speed = 0; // initial speed of 0
    }

    // Getters
    /**
    * This getter returns the colour.
    * @return colour This is the colour.
    */
    public String getColour() {
        return colour;
    }
    /**
    * This getter returns the speed.
    * @return colour This is the colour.
    */
    public int getSpeed() {
        return speed;
    }

    //setters
    /**
    * This setter sets the vehicle colour.
    * @param inputColour This is the colour of the car.
    */
    public void setColour(final String inputColour) {
        this.colour = inputColour;
    }

    //methods
    /**
    * This method accelerates the car.
    * @param increaseSpeed This is the acceleration.
    * @return speed This is the speed of the car.
    */
    public int accelerate(final int increaseSpeed) throws Exception {
        // adds speed to vehicle
        try {
            this.speed += increaseSpeed;

            if (this.speed > maxSpeed) {
                this.speed = maxSpeed;
                return this.speed;
            } else {
                return this.speed;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method brakes the car.
    * @param decreaseSpeed This is the decceleration.
    * @return speed This is the speed of the car.
    */
    public int brake(final int decreaseSpeed) throws Exception {
        // adds speed to vehicle
        try {
            this.speed -= decreaseSpeed;

            if (this.speed < 0) {
                this.speed = 0;
                return this.speed;
            } else {
                return this.speed;
            }
        } catch (Exception e) {
            throw null;
        }
    }

    /**
    * This method prints all vehicle info.
    */
    public void printInfo() {
        // prints every current field
        System.out.println("The colour of this vehicle is "
                            + this.colour);
        System.out.println("The current speed of this vehicle is "
                            + this.speed + " km/h.");
        System.out.println("The maximum speed of this vehicle is "
                            + this.maxSpeed + " km/h.");
    }
}
