

package myinterface;

/**
 *
 * @author Tim
 */
public interface Employee {
    
    public abstract String getIdNumber();
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract void setIdNumber(String idNumber);
    public abstract void setFirstName(String firstName);
    public abstract void setLastName(String lastName);

    public abstract double getAnnualPay();
   
}
