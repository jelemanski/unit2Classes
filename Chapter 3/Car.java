

/**
 * A car gas a certain fuel efficiency and a certain amount of fuel in the gas tank. the car can
 * be driven a certain distance.
 * 
 * Jimmy Lemanski
 * @version 9/10/15
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon */
    private double fuelEfficiency;
    
    /** amount amount of fuel in the tank in gallons */
    private double fuelInTank;

    /**
     * Default constructor for objects of class Car
     */
    public Car( double fuelEfficiency)
    {
        // initialise instance variables
        fuelEfficiency = fuelEfficiency;
        fuelInTank = 0;
    }

    /**
     * Simulates driving the car a distance and reduces the amount of fuel in the tank
     *
     *
     * @pre        specified distance cant result in consumption of more gas than is available 
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
