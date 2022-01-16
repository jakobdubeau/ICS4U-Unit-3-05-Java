/*
* The stack program uses OOP to create a stack.
*
* @author  Jakob
* @version 1.0
* @since   2020-12-07
*
*/

/**
* Main.
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
    * This is the main function.
    *
    * @param args this will not be used
    */
    public static void main(final String[] args) {

        final int fifty = 50;
        final String period = ".";
        final int sixty = 60;
        final int twenty = 20;

        final Vehicle car = new Vehicle("CB7AX9", "Red", 4, 50);
        final Vehicle car2 = new Vehicle("5KAJE6", "Blue", 6, 80);

        System.out.println("\nThe max speed of the both the cars are "
            + car.getMaxSpeed() + " and " + car2.getMaxSpeed() + period);

        System.out.println("\nThe first car's colour is " + car.getColour()
            + period);
        car.setColour("Purple");
        System.out.println("\nThe first car's colour changed to "
            + car.getColour() + period);

        car.accelerate(fifty);
        System.out.println("\nCar 1 has had their speed accelerated to "
            + car.getSpeed() + period);

        System.out.println("\nThe second car's plate is " + car2.getLiscence()
            + period);
        car2.setLiscence("AAAAAA");
        System.out.println("\nThe second car's plate changed to "
            + car2.getLiscence() + period);

        car2.accelerate(sixty);
        System.out.println("\nCar 2 has had their speed accelerated to "
            + car2.getSpeed() + period);

        car2.brake(twenty);
        System.out.println("\nCar2 hit the brake to make their speed "
            + car2.getSpeed());
    }
}
