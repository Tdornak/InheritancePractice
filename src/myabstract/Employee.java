

package myabstract;

/**
 *
 * @author Tim
 */
public abstract class Employee {
    
    private String idNumber;
    private String name;
    private String supervisorIdNumber;
    
    //this one was not working out with the commission
    //public abstract double getPayment();

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSupervisorIdNumber() {
        return supervisorIdNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupervisorIdNumber(String supervisorIdNumber) {
        this.supervisorIdNumber = supervisorIdNumber;
    }
    
    
    
}
