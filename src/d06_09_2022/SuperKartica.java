package d06_09_2022;
//Kreirati klasu SuperKartica koja ima:

//broj kartice
//ime i prezime vlasnika
//popust (200, 500, … )
//konstuktore (default-ni i sa parametrima)
//gettere i settere 
//metodu stampaj koja stampa karticu u formatu:
//(broj kartice), (ime i prezime)

public class SuperKartica {
	private int broj;
	private String punoIme;
	private double popust;

	public SuperKartica() {
		super();
	}

	public SuperKartica(int broj, String punoIme, double popust) {
		super();
		this.broj = broj;
		this.punoIme = punoIme;
		this.popust = popust;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println(this.broj + this.punoIme);
	}
}
