/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*/

/**
* Vehicle class.
*/
public final class Vehicle {

    /**
    * Plate.
    */
    private String liscensePlate;

    /**
    * Colour.
    */
    private String colour;

    /**
    * Doors.
    */
    private int doors;

    /**
    * Speed.
    */
    private int speed;

    /**
    * Max Speed.
    */
    private int maxSpeed;

    /**
    * Initial values.
    *
    * @param startColour colour
    * @param startPlate plate
    * @param startDoors door
    * @param vehicleMaxSpeed speed
    */

    public Vehicle(final String startPlate, final String startColour, final int
                    startDoors, final int vehicleMaxSpeed) {

        this.liscensePlate = startPlate;

        this.colour = startColour;

        this.doors = startDoors;

        this.speed = 0;

        this.maxSpeed = vehicleMaxSpeed;

    }

    /**
    * Getter.
    *
    * @return return
    */
    public String getLiscence() {
        return this.liscensePlate;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public String getColour() {
        return this.colour;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getDoors() {
        return this.doors;
    }

    /**
    * Getter.
    *
    * @return return
    */
    public int getSpeed() {
        return this.speed;
    }

    // setters

    /**
    * Setter.
    *
    * @param someLiscence Liscence
    */
    public void setLiscence(String someLiscence) {
        this.liscensePlate = someLiscence;
    }

    /**
    * Setter.
    *
    * @param someColour Colour
    */
    public void setColour(String someColour) {
        this.colour = someColour;
    }

    /**
    * Accelerates.
    *
    * @param acceleration acceleration.
    */
    public void accelerate(final int acceleration) {
        if (acceleration + speed > maxSpeed) {
            System.out.println("\nCannot accelerate more"
                + " than the maximum speed");
        }
        else {
            speed = speed + acceleration;
        }
    }

    /**
    * Applies brakes to a car.
    *
    * @param brakes the amount to which the speed will be reduced
    */
    public void brake(final int brakes) {
        if (brakes > speed) {
            System.out.println("\nCannot brake more than the current speed");
        }
        else {
            speed = speed - brakes;
        }
    }
}
