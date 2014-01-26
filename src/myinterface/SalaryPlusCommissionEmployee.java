

package myinterface;

/**
 *
 * @author Tim
 */

public class SalaryPlusCommissionEmployee extends SalariedEmployee implements Employee {
    
    private double commission;
        
    public double getPayment(double annualSalary) {
        return annualSalary / 12 + commission;
    }
    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission += commission;
    }
}
