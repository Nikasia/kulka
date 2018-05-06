import javax.swing.*;
import java.awt.event.*;

public class OknoNajlepsze extends JFrame implements ActionListener{

    JButton bZamknij = new JButton("Ok");

    public OknoNajlepsze(){
        super("Najlepsze wyniki");
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
