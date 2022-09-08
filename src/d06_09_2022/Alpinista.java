package d06_09_2022;
//Kreirati klasu ​Alpinista ​koja nasleđuje klasu Planinar. Klasa sadrži atribut koji pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se mogu menjati. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu: 
//Alpinista, id: (id) ime: (ime i rezime) Broj poena: (poeni) 

public class Alpinista extends Planinar {
	private int poeni;

	public Alpinista(String id, String punoIme, int poeni) {
		super(id, punoIme);
		this.poeni = poeni;
	}
	
	public int getPoeni() {
		return poeni;
	}

	@Override
	public boolean uspon(Planina planina) {
		if ( planina.getVisina() < 4000 ) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public int clanarina() {
		return 1500 - this.poeni * 50;
	}
	
	@Override
	public void print() {
		System.out.println("Alpinista, id: " + this.id);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Broj poena:" + this.poeni);
	}
		
	}

