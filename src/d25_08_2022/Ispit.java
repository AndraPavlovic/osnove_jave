package d25_08_2022;

public class Ispit {
	private String nazivPredmeta;
	private int ocena;
	private String profesor;

	public Ispit(String nazivPredmeta, int ocena, String profesor) {
		super();
		this.nazivPredmeta = nazivPredmeta;
		this.ocena = ocena;
		this.profesor = profesor;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public String rezultatIspita() {
		if (this.ocena < 6) {
			return "Ispit nije polozen";
		} else {
			return "Ispit je polozen";
		}
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + this.profesor + " " + 
	this.ocena);
	}
}