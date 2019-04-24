import model.Olive;

import java.text.NumberFormat;
import java.util.List;

public class OlivePress {

    public double getOil(List<Olive> olives) {

        double totalOil = 0;

        for (Olive o: olives) {
            System.out.println(o.getTypeName() + " has a " + "color "  + o.getColor());
            totalOil += o.crush();
        }
        return totalOil;
    }

}
