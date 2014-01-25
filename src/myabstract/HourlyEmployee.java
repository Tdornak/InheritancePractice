

package myabstract;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {

    private double hours;
    private double payRate;
    
    @Override
    public double getPayment() {
        return hours * payRate;
    }
    
    
    
    
}
