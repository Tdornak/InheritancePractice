

package myinterface;

/**
 *
 * @author Tim
 */
public interface Employee {
    
    public abstract String getIdNumber();
    public abstract String getName();
    public abstract String getSupervisorIdNumber();
    
    public abstract double payment(double pay);
   
}
