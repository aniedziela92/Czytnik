import javax.swing.*;
import java.io.File;

/**
 * Created by kacha_000 on 2014-12-02.
 */
public class otwieranieksiazki extends JPanel  {
    JFileChooser fc;
    książka ksiazka =new książka();

    public File nacisniecie_odcz() {

        fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(otwieranieksiazki.this);
        File file = fc.getSelectedFile();
        ksiazka.otwieraj(file);
        return file;


    }
}
