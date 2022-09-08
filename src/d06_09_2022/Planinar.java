package d06_09_2022;
//Kreirati apstraktnu klasu ​Planinar ​koja od zaštićenih atributa ima: 

//jedinstveni celobrojni identifikacioni broj
//ime i prezime 
//Dok od javnih metoda: 
//konstruktor koji postavlja sve atribute klase. 
//gettere i settere (atribute klase nije moguće menjati, nakon inicijalizacije tj. posle njihovog postavljanja u konstruktoru)
//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja ​vraća ​informaciju da li će se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina. 

public abstract class Planinar {
	protected String id;
	protected String punoIme;

	public Planinar(String id, String punoIme) {
		super();
		this.id = id;
		this.punoIme = punoIme;
	}

	public String getId() {
		return id;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public abstract void print();

	public abstract int clanarina();

	public abstract boolean uspon(Planina planina);

}
