import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kacha_000 on 2014-11-30.
 */
public class nawigacja extends JPanel implements ActionListener {
        okno parent;
        JButton poprzednia, nastepna;

        public nawigacja (okno tmp) {

            parent=tmp;
            this.setSize(1, 28);

            poprzednia = new JButton("poprzednia");
            this.add(poprzednia);
            poprzednia.addActionListener(this);

            nastepna = new JButton("nastepna");
            this.add(nastepna);
            nastepna.addActionListener(this);

        }

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == poprzednia) {
                parent.poprzednia();
                System.out.println("poprzednia");
            }
            else if (e.getSource() == nastepna) {
                parent.nastepna();
                System.out.println("nastepna");
            }
        }
    }

