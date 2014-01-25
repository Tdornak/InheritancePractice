

package myinterface;

/**
 *
 * @author Tim
 */
public class HourlyEmployee implements Employee {

    private int idNumber;
    private String name;
    private int supervisorIdNumber;
    private double hours;
    private double payRate;
    
    @Override
    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSupervisorIdNumber() {
        return supervisorIdNumber;
    }

    @Override
    public double payment() {
        return hours * payRate;
    }
    
    
    
}
