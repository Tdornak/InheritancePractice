

package my.concrete;

import java.text.NumberFormat;

/**
 *
 * @author Tim
 */
public class Startup {
    
    public static void main(String[] args) {
     
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        HourlyEmployee e1 = new HourlyEmployee();
        e1.setName("Rob");
        e1.setPayRate(8.5);
        System.out.println(e1.getName() + "  " + fmt.format(e1.getWage()));
        
        
        SalariedEmployee e2 = new SalariedEmployee();
        e2.setIdNumber("154");
        e2.setAnnualSalary(20000);
        System.out.println(e2.getIdNumber() + "  " + fmt.format(e2.monthlySalary()));
        
        
        SalaryPlusCommissionEmployee e3 = new SalaryPlusCommissionEmployee();
        e3.setSupervisorIdNumber("175");
        e3.setAnnualSalary(10000);
        e3.setCommission(15000);
        System.out.println(e3.getSupervisorIdNumber() + "  " + fmt.format(e3.getMonthlySalary(e3.getAnnualSarary())));
    }
    
}
