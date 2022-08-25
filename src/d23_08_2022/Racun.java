package d23_08_2022;

public class Racun {
	private String brojRacuna;
	private String imeIPrezime;
	private int stanje;

	public Racun(String brojRacuna, String imeIPrezime, int stanje) {
		this.brojRacuna = brojRacuna;
		this.imeIPrezime = imeIPrezime;
		this.stanje = stanje;
	}

	public String getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getImeIPrezime() {
		return imeIPrezime;
	}

	public void setImeIPrezime(String imeIPrezime) {
		this.imeIPrezime = imeIPrezime;
	}

	public int getStanje() {
		return stanje;
	}

	public void menjaStanjeRacunaUplatioca(int vrednost) {
		this.stanje = this.stanje - vrednost;

		if (this.stanje < 0) {
			this.stanje = 0;
		}
	}

	public void stampaj() {
		System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.stanje + " rsd");
	}

	public void menjajStanjePrimaoca(int vrednost) {
		this.stanje = this.stanje + vrednost;
	}

}
