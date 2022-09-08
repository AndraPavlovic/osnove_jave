package d06_09_2022;

import java.util.ArrayList;
//Kreirati klasu ​PlaninarskiDom​ koja ima privatne atribute: 
//naziv doma 
//godinu kada je osnovan. 
//članove doma koji su planinari (klasa vodi računa o nizu) 
//Dok od javnih: 
//default-ni konstuktor i konstuktor koji postavlja sve parametre 
//gettere i settere koji su potrebni 
//metodu učlani planinara, koja dodaje planinara u niz 
//metodu koja ​vraća ​broj planinara koji će se uspešno popeti na planinu (metoda za parametar prima Planinu za koju se proverava informacija)  
//metodu koja štampa podatke o domu i o svim članovima doma
//metodu koja racuna i vraca mesecni prihod od clanarina svih planinara

public class PlaninarskiDom {
	private String naziv;
	private int godOsnivanja;
	private ArrayList<Planinar> clanovi = new ArrayList<Planinar>();

	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String naziv, int godOsnivanja) {
		super();
		this.naziv = naziv;
		this.godOsnivanja = godOsnivanja;

	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodOsnivanja() {
		return godOsnivanja;
	}

	public ArrayList<Planinar> getClanovi() {
		return clanovi;
	}

	public void uclaniPlaninara(Planinar planinar) {
		clanovi.add(planinar);
	}

	public int brojPlaninaraKojiSePopeli(Planina planina) {
		int suma = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).uspon(planina) == true) {
				suma++;
			}
			suma++;
		}
		return suma;
	}

	public void print() {
		System.out.println(this.naziv + ", " + this.godOsnivanja);
		for (int i = 0; i < this.clanovi.size(); i++) {
			this.clanovi.get(i).print();
			System.out.println();
		}
	}

	public int mesecniPrihod() {
		int suma = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			suma += this.clanovi.get(i).clanarina();
		}
		return suma;
	}
}
