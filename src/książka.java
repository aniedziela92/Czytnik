import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
// w książce ma się otwierać cała tekst i może najwyżej pierwsza strona ale nie wiem

public class książka {

    String[] txt = new String[400000];
    public String tekst = new String();
    int j=0;

    public void  otwieraj(File file) {
        try {
            FileInputStream in = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;

            int i = 0;
            while ((line = reader.readLine()) != null) {
                txt[i] = line;
                i++;
            }
        } catch (
                IOException x
                ) {
            System.err.println(x);
        }

    }

}
