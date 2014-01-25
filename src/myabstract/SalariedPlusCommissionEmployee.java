

package myabstract;

/**
 *
 * @author Tim
 */
public class SalariedPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;

    //Still working on this
    //@Override
    public double getPayment(double annualSalary) {
        return annualSalary /12  + commission;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission += commission;
    }
    
    
    
}
