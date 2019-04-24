import model.Olive;
import model.OliveName;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/*
* the Olive class contains the string, the name of the OliveName. The OlivePress class has a method
* that can process the data, and the main class is creating the data and passing it to the
* OlivePress for processing.
*/

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 3));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 2));
//        olives.add(new Olive("Yellow Olive", 0x000002, 1.5));
//        olives.add(new Olive("Pure Purple Olive", 0x000003, 1.8512));

        OlivePress press = new OlivePress();
        double totalOil1 = press.getOil(olives);

//        NumberFormat number = NumberFormat.getNumberInstance();
//        number.setMaximumFractionDigits(3);
//        number.format(totalOil1);

        System.out.println("Total olive oil: " + totalOil1);

    }
}
