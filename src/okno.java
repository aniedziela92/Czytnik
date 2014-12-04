import javax.swing.*;
import java.awt.*;
import java.io.*;
/**
 * Created by kacha_000 on 2014-11-21.
 */
public class okno extends JFrame {
    przyciski przycisk = new przyciski(this);
    nawigacja nawi = new nawigacja(this);
    otwieranieksiazki ksi = new otwieranieksiazki();
    private final static String newline = "\n";


    JTextArea TextArea =new JTextArea(23,40);
    JPanel panel = new JPanel();
    JFrame ramka = new JFrame("Czytnik książek");
    okno() {

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setSize(500, 500);
        ramka.setResizable(false);
        setTitle("czytnik ksiazek");
        ramka.setVisible(true);
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(przycisk);

        // *************************Panel z przyciskami***********************************************

        // ************************ pole tekstowe ******************************************
        panel.setOpaque(true);
        TextArea.setEditable(false);
        TextArea.setFont(Font.getFont(Font.SANS_SERIF));
        JScrollPane scroller = new JScrollPane(TextArea);

        TextArea.setWrapStyleWord(true);
        TextArea.setLineWrap(true);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.setLayout(new FlowLayout());
        panel.add(scroller);
        panel.add(nawi);
        ramka.add(panel);



        ramka.add(panel);

    }

public void czytaj(){
    ksi.nacisniecie_odcz();
    pierwszastrona first = new pierwszastrona();
    TextArea.setText(first.wyswietl(ksi.ksiazka));

    // to jak nacisne ma mi się wyświetlać pierwsza strona ksiązki
}
public void szukaj(){}
public void usuń(){}
public void dodaj(){}
public void ustawienia() {}

 public void poprzednia(){
     poprzedniastrona next= new poprzedniastrona();
     TextArea.setText(next.poprzednia(ksi.ksiazka));
// tu jak nacisne ma mi się wyświetlać poprzednia strona książki jeśli tylko taka jest
    }
 public void nastepna(){
     nastepnastrona next= new nastepnastrona();
     TextArea.setText(next.nastepna(ksi.ksiazka));


// tu jak nacisne ma mi się wyświetlać poprzednia strona książki jeśli tylko taka jest
    }
}