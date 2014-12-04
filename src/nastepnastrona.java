/**
 * Created by kacha_000 on 2014-11-30.
 */
public class nastepnastrona {

    public String nastepna(książka ksi) {

        ksi.j++;
        int i = ksi.j;
        String[] txt = ksi.txt;
        String txtnast = new String();
        final String newline = "\n";
        for (int k = i * 5; k < 5 + i * 5; k++) {
            if (k >= 0 && k < txt.length) {
                if (txt[k] != null) {
                    txtnast = txtnast +newline+ txt[k];
                }
            }
            else {
                txtnast= "koniec";
            }
        }

        return txtnast;
    }

}
