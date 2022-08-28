package d25_08_2022;

import java.util.ArrayList;

public class Student {

	private String indeks;
	private String punoIme;
	private String tipStudija;

	ArrayList<Ispit> ispit = new ArrayList();

	public Student() {
		super();
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspit() {
		return ispit;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispit.add(ispit);
	}

	private int prosek() {
		int prosek = 0;
		for (int i = 0; i < this.ispit.size(); i++) {
			prosek = this.ispit.get(i).getOcena() / this.ispit.size();
		}
		return prosek;
	}

	public void stampaj() {
		System.out.println("Broj indeksa: " + this.indeks + " " +
	"Student: " + this.punoIme + " " + this.tipStudija);

		for (int i = 0; i < this.ispit.size(); i++) {
			System.out.print("Predmeti: ");
			this.ispit.get(i).stampaj();

		}
		System.out.println("Prosecna ocena je: " + this.prosek());
	}
}