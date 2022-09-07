package d05_09_2022;

import java.util.ArrayList;

//Kreirati abstraktnu klasu Radnik koja ima:
//	 ime i prezime
//	 niz sektora u kojima radi
//	 abstraktnu metodu koja vraca platu radnika
//	 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

public abstract class Radnik {
	private String punoIme;
	private ArrayList<Sektor> sektori = new ArrayList<Sektor>();

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public ArrayList<Sektor> getSektori() {
		return sektori;
	}

	public abstract double plata();

	public void zaposli(Sektor sektor) {
		sektori.add(sektor);
	}

}
