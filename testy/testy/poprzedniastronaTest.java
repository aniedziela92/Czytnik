package testy;

import org.junit.Assert;
import org.junit.Test;

import czytnik.ksiazka;
import czytnik.poprzedniastrona;


public class poprzedniastronaTest {

    @Test
    public void TestKoniecKsiazki(){
        ksiazka ks = new ksiazka();
        poprzedniastrona ps = new poprzedniastrona();

        for(int i = 0; i< ks.txt.length ; i++){
            ps.poprzednia(ks);

        }

        Assert.assertEquals("koniec", ps.poprzednia(ks));

    }

}
