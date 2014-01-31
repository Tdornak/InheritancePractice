

package myabstract;

/**
 *
 * @author Tim
 */
public abstract class Employee {
    
    private String idNumber;
    private String firstName;
    private String lastName;
    
    public abstract double getAnnualPay();

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
}
