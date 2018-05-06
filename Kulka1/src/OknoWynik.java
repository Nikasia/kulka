import javax.swing.*;
import java.awt.event.*;

public class OknoWynik extends JFrame implements ActionListener{

    JButton bZamknij = new JButton("Ok");

    public OknoWynik(){
        super("Twoj Wynik");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        bZamknij.setBounds(75, 150, 100, 20);
        add(bZamknij);
        bZamknij.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
    }
}
