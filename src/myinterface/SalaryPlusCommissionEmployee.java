

package myinterface;

/**
 *
 * @author Tim
 */

public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
        
    public double getAnnualPay() {
        return this.getAnnualSarary() + commission;
    }
    
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission += commission;
    }
}
