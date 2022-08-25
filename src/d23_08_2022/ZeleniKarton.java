package d23_08_2022;

public class ZeleniKarton {
	private String imeIPrezimeStudenta;
	private int brojIndeksa;
	private String predmet;
	private String imeIPrezimeProfesora;
	private int ocena;

	public ZeleniKarton(String imeIPrezimeStudenta, int brojIndeksa, String predmet, String imeIPrezimeProfesora,
			int ocena) {

		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
		this.brojIndeksa = brojIndeksa;
		this.predmet = predmet;
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
		this.ocena = ocena;
	}


	public String getImeIPrezimeStudenta() {
		return imeIPrezimeStudenta;
	}

	public void setImeIPrezimeStudenta(String imeIPrezimeStudenta) {
		this.imeIPrezimeStudenta = imeIPrezimeStudenta;
	}

	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getImeIPrezimeProfesora() {
		return imeIPrezimeProfesora;
	}

	public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
		this.imeIPrezimeProfesora = imeIPrezimeProfesora;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean ispitPolozen() {
		if (this.ocena > 5) {
			return true;
		} else {
			return false;
		}
	}

	public void stampaj() {
		System.out.println(this.predmet + " - " + this.ocena);
		System.out.println("Student: " + this.imeIPrezimeStudenta + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeIPrezimeProfesora);
	}
}