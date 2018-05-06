import javax.swing.*;
import java.awt.event.*;

public class OknoPodajImie extends JFrame implements ActionListener{

    JButton bAnuluj = new JButton("Anuluj");
    JButton bZatwierdz = new JButton("Zatwierdz");

    public OknoPodajImie(){
        super("Podaj Imie");
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
