/**
 * Created by kacha_000 on 2014-11-30.
 */
public class pierwszastrona {

    public String wyswietl(książka ksi){
        String[]txt=ksi.txt;
        String firstpage= new String();

        final String newline = "\n";
        for (int j = 0; j < 5; j++) {
            if (txt[j] != null) {
                 firstpage= firstpage + newline + txt[j].toString();
            }
        }
return firstpage;
    }
}