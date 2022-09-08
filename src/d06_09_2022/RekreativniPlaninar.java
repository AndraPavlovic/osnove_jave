package d06_09_2022;
//Kreirati klasu ​RekreativniPlaninar​ koja nasleđuje klasu Planinar. Klasa dodatno pamti još neke informacije koje se ne mogu menjati nakon postavljanja u konstuktoru: 

//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg) 
//naziv okruga odakle je rekreativni planinar. 
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine, s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje. 
//rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu: 
//Rekreativac, id: (id) ime: (imei prezime) Okrug: (okrug) 

public class RekreativniPlaninar extends Planinar {
	private int tezinaOpreme;
	private String nazivOkruga;
	private int maxUspon;

	public RekreativniPlaninar(String id, String punoIme, int tezinaOpreme, String nazivOkruga, int maxUspon) {
		super(id, punoIme);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUspon = maxUspon;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public int getMaxUspon() {
		return maxUspon;
	}

	@Override
	public boolean uspon(Planina planina) {
		if (this.maxUspon + this.tezinaOpreme * 50 >= planina.getVisina()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int clanarina() {
		return 1000;
	}

	@Override
	public void print() {
		System.out.println("Rekreativac, id: " + this.id);
		System.out.println("Ime: " + this.punoIme);
		System.out.println("Okrug: " + this.nazivOkruga);

	}

}
