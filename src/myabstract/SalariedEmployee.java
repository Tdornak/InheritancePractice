

package myabstract;

/**
 *
 * @author Tim
 */
public class SalariedEmployee extends Employee {

    private double annualSalary;
    
    @Override
    public double getPayment(double annualSalary) {
        return annualSalary / 12;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
     
    public double getAnnualSarary() {
        return annualSalary;
    }
    
    
}
