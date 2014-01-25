

package myabstract;

/**
 *
 * @author Tim
 */
public class SalariedPlusCommissionEmployee extends Employee {
    
    private double commission;

    //Still working on this
    @Override
    public double getPayment() {
        return monthlySalary + commission;
    }
    
    
    
}
