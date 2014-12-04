/**
 * Created by kacha_000 on 2014-11-30.
 */
public class poprzedniastrona {

    public String poprzednia(książka ksi) {
        ksi.j--;
        int i = ksi.j;

        String[] txt = ksi.txt;
        String txtpop = new String();
        final String newline = "\n";

        for (int k = i * 5; k < 5 + i * 5; k++) {
            if (k >= 0 && k < txt.length) {
                if (txt[k] != null) {
                    txtpop = txtpop +newline + txt[k];
                }
            }
            else{
                txtpop= "początek";
            }
        }

return txtpop;
    }
}