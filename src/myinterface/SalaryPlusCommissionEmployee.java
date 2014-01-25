

package myinterface;

/**
 *
 * @author Tim
 */

public class SalaryPlusCommissionEmployee extends SalariedEmployee implements Employee {
    
    private double commission;
    
    
    public double getPayment(double monthlySalary) {
        return monthlySalary + commission;
        
    }
    
}
