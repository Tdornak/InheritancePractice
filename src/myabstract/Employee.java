

package myabstract;

/**
 *
 * @author Tim
 */
public abstract class Employee {
    
    private int idNumber;
    private String name;
    private int supervisorIdNumber;
    
    public abstract double getPayment();

    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getSupervisorIdNumber() {
        return supervisorIdNumber;
    }
    
    
    
}
