

package my.concrete;

/**
 *
 * @author Tim
 */
public class Employee {
    
    private int idNumber;
    private String name;
    /**Every employee has to have a boss, and once your at the top
     * your not an employee but the CEO.
     */
    private int supervisorIdNumber;

//    public Employee(int idNumber, String name, int supervisorIdNumber) {
//        this.idNumber = idNumber;
//        this.name = name;
//        this.supervisorIdNumber = supervisorIdNumber;
//    }
    
    public int getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public int getSupervisorIdNumber() {
        return supervisorIdNumber;
    }
    
    
    
    
}
