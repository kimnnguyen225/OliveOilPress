import model.Olive;
import java.util.List;

public class OlivePress implements Press {
    /*this class must either be declared abstract, or it must implement the abstract method
    setOil(). The word abstract in Java means you've defined what a method should
    look like, but you haven't said how it's supposed to do its work.
    */
    private double currentOil = 0;

    public double getOil(List<Olive> olives) {
        double totalOil = currentOil;
        for (Olive o: olives) {
            totalOil += o.getOil();
        }
        return totalOil;
    }

    @Override
    public void setOil(double oil) {
        currentOil = oil;
    }

}
