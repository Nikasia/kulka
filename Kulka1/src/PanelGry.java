import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PanelGry extends JPanel {
    public PanelGry(){
        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        Rectangle2D prostokat = new Rectangle2D.Double(10, 10, 380, 380);
        Ellipse2D kolo = new Ellipse2D.Double(10, 10, 380, 380);

        g2d.draw(prostokat);
        g2d.draw(kolo);
    }
}
