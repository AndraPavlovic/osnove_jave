package d26_08_2022;

public class Trener extends Osoba {
	private String godIskustva;
	private String tipTrenera;

	public Trener(String punoIme, String jmbg, String godinaRodjenja, String godIskustva, String tipTrenera) {
		super(punoIme, jmbg, godinaRodjenja);
		this.godIskustva = godIskustva;
		this.tipTrenera = tipTrenera;
	}

	public String getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(String godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTipTrenera() {
		return tipTrenera;
	}

	public void setTipTrenera(String tipTrenera) {
		this.tipTrenera = tipTrenera;
	}

	public void stampajTrenera() {
		this.stampaj();
		System.out.println("Godine iskustva: " + this.godIskustva + "godina");
		System.out.println("Tip trenera: " + this.tipTrenera);

	}
}