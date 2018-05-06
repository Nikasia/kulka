import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;

public class Odczyt  {
    public ArrayList<PlanszaGry> plansze = new ArrayList<PlanszaGry>();

    public Odczyt() throws FileNotFoundException {
        File plik = new File("poziomy.txt");
        Scanner odczyt = new Scanner(plik);


        String zdanie;
            while (odczyt.hasNextLine()) {
                zdanie=odczyt.nextLine();
                if(zdanie.equals("plansza")) {
                    ArrayList<Rectangle2D> sciany = new ArrayList<Rectangle2D>();
                    ArrayList<Ellipse2D> portale = new ArrayList<Ellipse2D>();
                    while(!(zdanie.equals("koniec"))) {
                        zdanie=odczyt.nextLine();
                        if (zdanie.equals("sciana")) {
                            int x = Integer.parseInt(odczyt.nextLine());
                            int y = Integer.parseInt(odczyt.nextLine());
                            int width = Integer.parseInt(odczyt.nextLine());
                            int high = Integer.parseInt(odczyt.nextLine());
                            Rectangle2D sciana = new Rectangle2D.Double(x, y, width, high);
                            sciany.add(sciana);
                        } else if (zdanie.equals("portal")) {
                            int x = Integer.parseInt(odczyt.nextLine());
                            int y = Integer.parseInt(odczyt.nextLine());
                            int width = Integer.parseInt(odczyt.nextLine());
                            int high = Integer.parseInt(odczyt.nextLine());
                            Ellipse2D portal = new Ellipse2D.Double(x, y, width, high);
                            portale.add(portal);
                        }
                    }
                    PlanszaGry plansza = new PlanszaGry(sciany, portale);
                    plansze.add(plansza);
                }

            }
    }
}
