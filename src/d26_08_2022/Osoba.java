package d26_08_2022;

public class Osoba {
	protected String punoIme;
	protected String jmbg;
	protected String godinaRodjenja;

	public Osoba(String punoIme, String jmbg, String godinaRodjenja) {
		super();
		this.punoIme = punoIme;
		this.jmbg = jmbg;
		this.godinaRodjenja = godinaRodjenja;

	}

	public Osoba() {
		super();
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}

	public String getGodinaRodjenja() {
		return godinaRodjenja;
	}

	public void setGodinaRodjenja(String godinaRodjenja) {
		this.godinaRodjenja = godinaRodjenja;
	}

	public void stampaj() {
		System.out.println(this.punoIme + this.godinaRodjenja + this.jmbg);
	}
}
