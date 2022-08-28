package d25_08_2022;
//Napisati klasu Student koja ima
//broj indeksa
//ime i prezime
//tip studija (osnovne, master, doktorske)
//niz ispita
//konstuktore koje mislite da ce vam trebati
//gettere i settere za indeks, ime i prezime, tip studija
//getter za niz predmeta
//metodu dodaj ispit u niz ispita
//metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
//
//
//Napisati klasu Ispit koja ima
//naziv predmeta
//ocenu (u rasponu od 5 do 10)
//Ime i prezime profesora koji predaje predmet
//konstuktore koje mislite da ce vam trebati
//gettere i settere za sve atribute
//metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)

public class Zadatak1 {
	public static void main(String[] args) {
	Ispit ispit1 = new Ispit ("Istorija 20.vek ", 10, "Andrija Pavlovic");

	Ispit ispit2 = new Ispit ("Opsta istorija 19. veka ", 8, "Pera Peric");
	Ispit ispit3 = new Ispit ("Nacionalna istorija 19. veka ",6 , "Nikola Nikolic");

	Student student = new Student ();
	student.setIndeks("23512");
	student.setPunoIme("Marko Markovic,");
	student.setTipStudija("Osnovne studije");
	
	student.dodajIspit(ispit1);
	student.dodajIspit(ispit2);
	student.dodajIspit(ispit3);
	
	student.stampaj();
}
}
