

package my.concrete;

/**
 *
 * @author Tim
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    
    public double getMonthlySalary(double monthlySalary) {
        return monthlySalary /12 + commission;
        
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }
    
}
