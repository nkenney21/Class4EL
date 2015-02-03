

package Model;

import java.io.Serializable;

/**
 *
 * @author neilkenney
 */
public class CalculatorService implements Serializable {
    private int serviceId;
    
    public double getRectangleArea(double length, double width){
        
        return length * width;
        
    }
    
    public double getCicrleArea(double radius){
        
        return 2 * 3.1459 * radius;
    }
    
    public double getTriangleArea(double base, double height){
        
        return .5 * base * height;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.serviceId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CalculatorService other = (CalculatorService) obj;
        if (this.serviceId != other.serviceId) {
            return false;
        }
        return true;
    }
    
    

}
