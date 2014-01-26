

package my.concrete;

/**
 *
 * @author Tim
 */
public class Employee {
    
    private String idNumber;
    private String name;
    /**Every employee has to have a boss, and once your at the top
     * your not an employee but the CEO.
     */
    private String supervisorIdNumber;

    
//    public Employee(int idNumber, String name, int supervisorIdNumber) {
//        this.idNumber = idNumber;
//        this.name = name;
//        this.supervisorIdNumber = supervisorIdNumber;
//    }
    

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getSupervisorIdNumber() {
        return supervisorIdNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupervisorIdNumber(String supervisorIdNumber) {
        this.supervisorIdNumber = supervisorIdNumber;
    }
    
    
    
    
}
