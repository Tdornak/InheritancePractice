

package myinterface;

/**
 *
 * @author Tim
 */
public class SalariedEmployee implements Employee{

    
    
    private String idNumber;
    private String name;
    private String supervisorIdNumber;
    private double annualSalary;
    
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
    
    public double getAnnualSarary() {
        return annualSalary;
    }

    @Override
    public double payment(double annualSalary) {
        return annualSalary / 12;
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

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
    
}
