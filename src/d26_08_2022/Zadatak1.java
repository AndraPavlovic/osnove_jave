package d26_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.Zadatak
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
		Igrac igrac1 = new Igrac ("Andrija Pavlovic ", "412415425", "11.08.2000 ", 5, "napadac", false);
		Igrac igrac2 = new Igrac ("Nikola Nikolic ", "2526525", "06.12.1999 ", 11, "vezni", true);
		
		igrac1.stampajIgrac();
		igrac2.stampajIgrac();
		
		
		Trener trener1 = new Trener ("Marko Markovic ", "7496347534" , "1970. ", " 16 " , "Pomocni trener ");
		Trener trener2 = new Trener ("Stefan Stefanovic ", "283824381" , "1973. ", " 14 " , " Trener za igru ");
		
		trener1.stampajTrenera();
		trener2.stampajTrenera();
	}

}
