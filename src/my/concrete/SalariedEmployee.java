

package my.concrete;

/**
 *
 * @author Tim
 */
public class SalariedEmployee extends Employee {
 
    private double annualSalary;

    @Override
    public double getAnnualPay() {
        return annualSalary;
    }
    
    public double getAnnualSarary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
    
}
