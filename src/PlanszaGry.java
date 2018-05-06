import java.awt.*;
import java.awt.geom.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.*;

public class PlanszaGry extends JPanel{

    ArrayList<Rectangle2D> sciany;
    ArrayList<Ellipse2D> portale;

    public PlanszaGry (){
        setPreferredSize(new Dimension(400, 400));
    }
    public PlanszaGry (ArrayList<Rectangle2D> sciany, ArrayList<Ellipse2D> portale){
        setPreferredSize(new Dimension(400, 400));
        this.sciany=sciany;
        this.portale=portale;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        for(int i = 0; i<sciany.size(); i++){
            Rectangle2D sciana = sciany.get(i);
            g2d.draw(sciana);
        }
        for(int i = 0; i<portale.size(); i++){
            Ellipse2D portal = portale.get(i);
            g2d.draw(portal);
        }
    }
}
