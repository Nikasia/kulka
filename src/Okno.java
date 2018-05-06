import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.*;

public class Okno extends JFrame implements ActionListener {

    JButton bSterowanie = new JButton("Sterowanie");
    JMenuBar menuBar;
    JMenu menuGra, menuPomoc;
    JMenuItem mGraj, mNajlepsi, mPoziomTrudnosci, mWyjdz, mSterowanie;
    JPanel panel;
    ArrayList<PlanszaGry> plansze = new ArrayList<PlanszaGry>();


    public Okno(){
        super("Kulka");
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(null);

        menuBar = new JMenuBar();
        menuGra = new JMenu("Gra");
        menuPomoc = new JMenu("Pomoc");

        mGraj = new JMenuItem("Graj");
        mNajlepsi = new JMenuItem("Lista 10 najlepszych");
        mPoziomTrudnosci = new JMenuItem("Poziom trudnosci");
        mWyjdz = new JMenuItem("Wyjdz");

        mSterowanie = new JMenuItem("Sterowanie");

        menuGra.add(mGraj);
        menuGra.add(mNajlepsi);
        menuGra.add(mPoziomTrudnosci);
        menuGra.add(mWyjdz);

        menuPomoc.add(mSterowanie);

        mWyjdz.addActionListener(this);
        mGraj.addActionListener(this);
        mNajlepsi.addActionListener(this);
        mPoziomTrudnosci.addActionListener(this);

        mSterowanie.addActionListener(this);

        setJMenuBar(menuBar);
        menuBar.add(menuGra);
        menuBar.add(menuPomoc);

        panel = new PanelGry();

        add(panel);

        pack();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if(zrodlo == mWyjdz){
            dispose();
        }
        else if(zrodlo == mSterowanie){
            OknoSterowania sterowanie=new OknoSterowania();
        }
        else if(zrodlo == mNajlepsi){
            OknoNajlepsze najlepsze=new OknoNajlepsze();
        }
        else if(zrodlo == mPoziomTrudnosci) {
            OknoPoziomTrudnosci poziomTrudnosci = new OknoPoziomTrudnosci();
        }
        else if(zrodlo == mGraj) {
            OknoPodajImie podajImie = new OknoPodajImie();
            try {
                Odczyt odczyt = new Odczyt();
                plansze=odczyt.plansze;
                remove(panel);
                panel = plansze.get(0);
                add(panel);
                pack();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }

        }
    }
}
