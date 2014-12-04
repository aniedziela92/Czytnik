package testy;

import org.junit.Assert;
import org.junit.Test;

import czytnik.ksiazka;
import czytnik.nastepnastrona;



public class nastepna_strona_test {
	
	@Test
	public void TestKoniecKsiazki(){
		ksiazka ks = new ksiazka();
		nastepnastrona ns = new nastepnastrona();
		
		for(int i = 0; i< ks.txt.length ; i++){
			ns.nastepna(ks);
			
		}
		
		Assert.assertEquals("koniec", ns.nastepna(ks));
		
	}

}
