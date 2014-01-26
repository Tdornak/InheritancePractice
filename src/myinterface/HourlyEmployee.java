

package myinterface;

/**
 *
 * @author Tim
 */
public class HourlyEmployee implements Employee {

    private String idNumber;
    private String name;
    private String supervisorIdNumber;
    private double payRate;
    
    @Override
    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSupervisorIdNumber() {
        return supervisorIdNumber;
    }

    @Override
    public double payment(double hours) {
        return hours * payRate;
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

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    
    
}
