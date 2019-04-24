import model.*;
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
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        Press press = new OlivePress(); //press is instance of Press interface, also an instance
        // of OlivePress class, because OlivePress implements Press interface
        press.setOil(5); //starting at 5 mL of oil
        double totalOil = press.getOil(olives);

        NumberFormat number = NumberFormat.getInstance();
        number.setMaximumFractionDigits(3);

        System.out.println("---------------------------");
        System.out.println("Total olive oil: " + number.format(totalOil) + " mL");

    }
}
