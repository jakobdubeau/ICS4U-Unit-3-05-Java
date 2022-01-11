/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

final class Main {

/**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The vehicle program.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {

        final Vehicle car = new Vehicle("AAAA", "red", 4, 50);
        System.out.println(car.getColour());
        car.setColour("blue");
        System.out.println(car.getColour());
    }
}
