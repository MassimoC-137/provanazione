package it.prova.provanazione.test;

import it.prova.provanazione.model.Nazione;

public class TestNazione {

	public static void main(String[] args) {
		
		Nazione nazione1 = new Nazione("Italia", 302068, 59000000);
		Nazione nazione2 = new Nazione("USA", 9834000, 336000000); 
		Nazione nazione3 = new Nazione("Singapore", 683, 5400000); 
		
		Nazione elenco[] = {nazione1, nazione2, nazione3}; 
		
		Nazione laMiaNazione = new Nazione("Massilandia", 1, 1); 
		
//		System.out.println(laMiaNazione.esisteAlmenoUnaPiuEstesa(elenco));
//		
//		System.out.println(laMiaNazione.quanteSonoPiuPopolose(elenco));
//		
//		System.out.println(laMiaNazione.haPiuAbitantiDiTutte(elenco));
//		
//		System.out.println(laMiaNazione.hannoLaStessaIniziale(elenco));
//		
		System.out.println(laMiaNazione.ePiuEstesaDellaMedia(elenco));
		
		
		
	}
}
