import model.Olive;

import java.util.List;

public interface Press {

    // no method here, it means, any class that implements this interface, must have this
    // method, must return double, and must accept single argument, a list of olives object
    public double getOil(List<Olive> olives);
    public void setOil(double oil);

}
