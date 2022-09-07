package d05_09_2022;

public class Zadatak1 {
	//U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sektor prodaja = new Sektor();
		prodaja.setNaziv("Prodaja");
		prodaja.setPlata(70000);
		
		Sektor usluge = new Sektor();
		usluge.setNaziv("Usluga");
		usluge.setPlata(60000);
		
		Magacioner m = new Magacioner();
		m.setPunoIme("Andrija Pavlovic");
		m.zaposli(prodaja);
		m.zaposli(usluge);
		m.plata();
		
		Sektor pravni = new Sektor();
		pravni.setNaziv("Pravna sluzba");
		pravni.setPlata(80000);
		Sektor finansije = new Sektor();
		finansije.setNaziv("Finansijska sluzba");
		finansije.setPlata(40000);
		Menadzer men = new Menadzer();
		men.setPunoIme("Nikola Nikolic");
		men.zaposli(finansije);
		men.zaposli(pravni);
		men.plata();
		
		System.out.println("Magacioner: " + m.getPunoIme() + " , Plata: " + m.plata());
		System.out.println("Menadzer: " + men.getPunoIme() + " , Plata: " + men.plata());
		
	}

}
