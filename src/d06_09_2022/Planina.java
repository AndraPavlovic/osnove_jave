package d06_09_2022;
//Kreirati klasu ​Planina ​koja od privatnih atributa ima: 

//ime planine 
//naziv države u kojoj se nalazi 
//visinu planine. 
//a od javnih metoda: 
//default-ni konstruktor i konstuktor koji postavlja sve parametre 
//gettere i settere za sve atribute 

public class Planina {
	private String ime;
	private String drzava;
	private int visina;

	public Planina() {
		super();
	}

	public Planina(String ime, String drzava, int visina) {
		super();
		this.ime = ime;
		this.drzava = drzava;
		this.visina = visina;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

}
