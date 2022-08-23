package d22_08_2022;

import p22_08_2022.ClanskaKarta;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Kreirati klasu Autor koja ima
//		-ime i prezime
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu:
//		(ime autora) (prezime autora)
//
//		Kreirati klasu Knjiga koji ima:
//		-ISBN
//		-naziv
//		-godina izdanja
//		-autor
//		-konstuktore koje mislite da su vam potrebni
//		-gettere i settere za atribute
//		-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//		(ISBN)
//		(naziv) - (godina izdanja)
//		autor: (ime autora) (prezime autora) 
//
//			U glavnom programu napraviti vise autora sa vise knjiga.

	Autor andrija = new Autor("Andrija Pavlovic");
	Knjiga istorija = new Knjiga("12-344-241", "Istorija 20.veka", 2020, andrija);
	istorija.stampaj();	
	
	Autor nikola = new Autor("Nikola Nikolic");
	Knjiga geografija = new Knjiga("12-432-432", "Geografija Evrope", 2019, nikola);
	geografija.stampaj();
	
	Autor petar = new Autor("Petar Petrovic");
	Knjiga filozofija = new Knjiga("53-855.932", "Anticka filozofija", 2022, petar);
	filozofija.stampaj();
	}

}
