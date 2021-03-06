

package myinterface;

import java.text.NumberFormat;

/**
 *
 * @author Tim
 */
public class Startup {
    
    public static void main(String[] args) {
     
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        HourlyEmployee e1 = new HourlyEmployee();
        e1.setFirstName("Billy");
        e1.setPayRate(8.5);
        e1.setHours(40);
        System.out.println(fmt.format(e1.getAnnualPay()));
        
        
        SalariedEmployee e2 = new SalariedEmployee();
        e2.setIdNumber("275");
        e2.setAnnualSalary(20000);
        System.out.println(fmt.format(e2.getAnnualPay()));
        
        
        SalaryPlusCommissionEmployee e3 = new SalaryPlusCommissionEmployee();
        
        e3.setAnnualSalary(10000);
        e3.setCommission(15000);
        System.out.println(fmt.format(e3.getAnnualPay()));
    }
    
}
