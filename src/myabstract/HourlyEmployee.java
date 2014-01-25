

package myabstract;

/**
 *
 * @author Tim
 */
public class HourlyEmployee extends Employee {

    //private double hours;
    private double payRate;
    
    @Override //the hours can changes every week depending on the job, the payRate probally wont.
    public double getPayment(double hours) {
        return hours * payRate;
    }

//    public double getHours() {
//        return hours;
//    }
//
//    public void setHours(double hours) {
//        this.hours = hours;
//    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
    
}
