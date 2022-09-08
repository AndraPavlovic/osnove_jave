package d06_09_2022;
//Kreirati abstraktnu klasu Ambalaza koja ima:

//barkod (primer: 328232-2823)
//naziv artikla
//neto tezinu
//bruto tezinu
//konstuktore (default-ni i sa parametrima)
//gettere i settere
//metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//abstraktnu metodu koja vraca cenu artikla
//abstraktnu metodu stampaj

public abstract class Ambalaza {
	protected String barkod;
	protected String naziv;
	protected int neto;
	protected int bruto;

	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String naziv, int neto, int bruto) {
		super();
		this.barkod = barkod;
		this.naziv = naziv;
		this.neto = neto;
		this.bruto = bruto;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getNeto() {
		return neto;
	}

	public void setNeto(int neto) {
		this.neto = neto;
	}

	public int getBruto() {
		return bruto;
	}

	public void setBruto(int bruto) {
		this.bruto = bruto;
	}

	public int tezinaPakovanja() {
		return this.bruto - this.neto;
	}

	public abstract double cena();

	public abstract void print();
}
