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

    private String liscensePlate;

    private String colour;

    private int doors;

    private int speed;

    private int maxSpeed;

    public Vehicle(final String startPlate, final String startColour, final int
                    startDoors, final int vehicleMaxSpeed) {

    this.liscensePlate = startPlate;

    this.colour = startColour;

    this.doors = startDoors;

    this.speed = 0;

    this.maxSpeed = vehicleMaxSpeed;

}

    public String getLiscence() {
        return this.liscensePlate;
    }

    public String getColour() {
        return this.colour;
    }

    //setters
    public void setLiscence(String someLiscence) {
        this.liscensePlate = someLiscence;
    }

    public void setColour(String someColour) {
        this.colour = someColour;
    }
}
