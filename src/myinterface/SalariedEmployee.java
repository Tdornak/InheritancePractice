

package myinterface;

/**
 *
 * @author Tim
 */
public class SalariedEmployee implements Employee{

    //Employee as an interface means i have to put this here and in hourlyemployee
    
    private int idNumber;
    private String name;
    private int supervisorIdNumber;
    private double annualSalary;
    
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
    
    public double getAnnualSarary() {
        return annualSalary;
    }

    @Override
    public double payment() {
        return annualSalary / 12;
    }
    
    
    
}
