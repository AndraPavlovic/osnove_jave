package d06_09_2022;
//Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:

//atribut koji kaze da li se moze reciklirati
//osnovna cena
//gettere i setter za atribute
//konstuktori koji su vam potrebni
//racuna cenu tako da ispunjava uslova:
//ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//ako nije u cenu ulazi samo osnovna cena
//metoda stampaj stampa sve podatke iz klase tetrapak.

public class Tetrapak extends Ambalaza {
	private boolean recikliranje;
	private double osnovnaCena;

	public Tetrapak(boolean recikliranje, int osnovnaCena) {
		super();
		this.recikliranje = recikliranje;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isRecikliranje() {
		return recikliranje;
	}

	public void setRecikliranje(boolean recikliranje) {
		this.recikliranje = recikliranje;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cena() {
		if (this.recikliranje == true) {
			return (this.tezinaPakovanja() * 1.5 + this.osnovnaCena);
		}
		return this.osnovnaCena;
	}

	@Override
	public void print() {
		System.out.println(this.naziv);
		System.out.println("Cena: " + this.cena());
		System.out.println("Da li moze da se reciklira: " + this.recikliranje);

	}

}
