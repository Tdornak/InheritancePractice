

package myabstract;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {

    
    private double payRate;
    private double hours;
    
    @Override 
    public double getAnnualPay() {
        return hours * payRate * 52;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    
    
}
