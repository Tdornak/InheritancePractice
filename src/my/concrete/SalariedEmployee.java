

package my.concrete;

/**
 *
 * @author Tim
 */
public class SalariedEmployee extends Employee {
 
    private double annualSalary;

//    public SalariedEmployee(int idNumber, String name, int supervisorIdNumber, double annualSalary) {
//        super(idNumber, name, supervisorIdNumber);
//        this.annualSalary = annualSalary;
//    }
    
    public double getAnnualSarary() {
        return annualSalary;
    }
    
    public double monthlySalary() {
        return annualSalary / 12;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
}
