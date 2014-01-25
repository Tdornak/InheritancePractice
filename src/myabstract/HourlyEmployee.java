

package myabstract;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {

    private double hours;
    private double payRate;
    
    //@Override
    public double getPayment() {
        return hours * payRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    
}
