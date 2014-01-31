

package myinterface;

/**
 *
 * @author Tim
 */
public class HourlyEmployee implements Employee {

    private String idNumber;
    private String firstName;
    private String lastName;
    private double payRate;
    private double hours;
   
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getAnnualPay() {
        return payRate * hours * 52;
    }

    
    
}
