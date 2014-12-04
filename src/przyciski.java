import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kacha_000 on 2014-11-21.
 */
public class przyciski extends JPanel  implements ActionListener {
    okno parent;
    JButton czytaj,szukaj,usuń,dodaj,ustawienia;


     public przyciski(okno tmp) {

        parent=tmp;
        this.setSize(1, 28);

        czytaj= new JButton("czytaj");
        this.add(czytaj);
        czytaj.addActionListener(this);

        szukaj= new JButton("szukaj");
        this.add(szukaj);
        szukaj.addActionListener(this);

        usuń= new JButton("usuń");
        this.add(usuń);
        usuń.addActionListener(this);

        dodaj= new JButton("dodaj");
        this.add(dodaj);
        dodaj.addActionListener(this);

        ustawienia= new JButton("ustawienia");
        this.add(ustawienia);
        ustawienia.addActionListener(this);
     }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== czytaj) {
            parent.czytaj();
            System.out.println("czytaj");
        }
        else if(e.getSource()== szukaj) {
            parent.szukaj();
            System.out.println("szukaj");
        }
        else if(e.getSource()== usuń) {
            parent.usuń();
            System.out.println("usuń");
        }
        else if(e.getSource()== dodaj) {
            parent.dodaj();
            System.out.println("dodaj");
        }
        else if(e.getSource()== ustawienia) {
            parent.ustawienia();
            System.out.println("ustawienia");

        }
    }
}