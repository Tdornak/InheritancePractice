

package myinterface;

/**
 *
 * @author Tim
 */
public class SalariedEmployee implements Employee{

    private String idNumber;
    private String firstName;
    private String lastName;
    private double annualSalary;
    
    @Override
    public String getIdNumber() {
        return idNumber;
    }
    
    public double getAnnualSarary() {
        return annualSalary;
    }

    @Override
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
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
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public double getAnnualPay() {
        return annualSalary;
    }
    
}
