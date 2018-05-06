import javax.swing.*;
import java.awt.event.*;

public class OknoPoziomTrudnosci extends JFrame implements ActionListener {

    JButton bZatwierdz = new JButton("Zatwierdz");
    JButton bAnuluj = new JButton("Anuluj");

    public OknoPoziomTrudnosci(){
        super("Poziom Trudnosci");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        bAnuluj.setBounds(125, 150, 100, 20);
        add(bAnuluj);
        bAnuluj.addActionListener(this);
        bZatwierdz.setBounds(25, 150, 100, 20);
        add(bZatwierdz);
        bZatwierdz.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
