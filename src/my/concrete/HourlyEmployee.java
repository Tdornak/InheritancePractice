

package my.concrete;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {
    
    private double hours;
    private double payRate;
    
    public double getWage() {
        return hours * payRate;
    }
    
}
