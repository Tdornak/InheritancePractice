

package my.concrete;

/**
 *
 * @author Tim
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    
    public double getMonthlySalary(double monthlySalary) {
        return monthlySalary + commission;
        
    }
    
}
