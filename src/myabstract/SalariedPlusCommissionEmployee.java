

package myabstract;

/**
 *
 * @author Tim
 */
public class SalariedPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;

    @Override
    public double getAnnualPay() {
        return this.getAnnualSarary()  + commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission += commission;
    }
    
    
    
}
