

package my.concrete;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {
    
    
    private double payRate;
    
    public double getWage(double hours) {
        return hours * payRate;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    
}
