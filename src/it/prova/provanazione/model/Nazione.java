package it.prova.provanazione.model;

public class Nazione {

	private String denominazione;
	private int superficie;
	private int abitanti;

	public Nazione() {

	}

	public Nazione(String denominazione, int superficie, int abitanti) {

		this.denominazione = denominazione;
		this.superficie = superficie;
		this.abitanti = abitanti;
	}

	public String getDenominazione() {
		return denominazione;

	}

	public void setDenominazione(String denominazione) {
		this.denominazione = denominazione;

	}

	public int getSuperficie() {
		return superficie;

	}

	public void setsuperficie(int superficie) {
		this.superficie = superficie;

	}

	public int getAbitanti() {
		return abitanti;

	}

	public void setAbitanti(int abitanti) {
		this.abitanti = abitanti;

	}

	public boolean esisteAlmenoUnaPiuEstesa(Nazione[] elenco) {

		for (int i = 0; i < elenco.length; i++) {
			if (this.superficie > elenco[i].getSuperficie()) {
				return false;
			}
		}
		return true;
	}

	public int quanteSonoPiuPopolose(Nazione[] elenco) {

		int numeroNazioni = 0;
		for (int i = 0; i < elenco.length; i++) {
			if (this.abitanti < elenco[i].getAbitanti()) {
				numeroNazioni++;
			}
		}
		return numeroNazioni;
	}

	public boolean haPiuAbitantiDiTutte(Nazione[] elenco) {

		for (int i = 0; i < elenco.length; i++) {
			if (this.abitanti < elenco[i].getAbitanti()) {
				return false;
			}
		}
		return true;
	}

	public boolean hannoLaStessaIniziale(Nazione[] elenco) {
		
		for (int i = 0; i < elenco.length; i++) {
			if (this.denominazione.charAt(0) != elenco[i].getDenominazione().charAt(0)) {
				return false; 
			}
		}
		return true;
	}

	public boolean ePiuEstesaDellaMedia(Nazione[] elenco) {
		
		int media = 0;
		for (int i = 0; i < elenco.length; i++) {
			media += elenco[i].getSuperficie() / elenco.length;
			}
			if (this.superficie > media) {
				return true;
			}
			return false; 
		}
}
