package d06_09_2022;
//Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:

//kaucija za flasu
//atribut koji kaze da li se za flasu placa kaucija
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu
//ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//ako se ne placa, (osnovna cena) * 1.2
//metoda stampaj stampa sve podatke iz klase staklena flasa.

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucija;
	private boolean daLiSePlacaKaucija;
	private double osnovnaCena;

	public StaklenaAmbalaza() {
		super();
	}

	public StaklenaAmbalaza(double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
		super();
		this.kaucija = kaucija;
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}

	public double getKaucija() {
		return kaucija;
	}

	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}

	public boolean isDaLiSePlacaKaucija() {
		return daLiSePlacaKaucija;
	}

	public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
		this.daLiSePlacaKaucija = daLiSePlacaKaucija;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if (this.daLiSePlacaKaucija == true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		}
		return this.osnovnaCena * 1.2;
	}

	@Override
	public void print() {
		System.out.println(this.kaucija);
		System.out.println(this.daLiSePlacaKaucija);
		System.out.println(this.osnovnaCena);
	}
}
