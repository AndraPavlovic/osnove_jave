package d23_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Zadatak
//		Kreirati klasu ZeleniKarton koja ima:
//		ime i prezime studenta 
//		broj indeksa 
//		naziv predmeta
//		ime i prezime profesora
//		ocenu - od 5 do 10
//		gettere i settere
//		konstruktore
//		metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//		metodu stampaj koja stampa podatke u formatu:
//				(naziv predmeta) - (ocena)
//				Student: ime i prezime, broj indeksa
//				Profesor: ime i prezime
//
//			U glavnoj klasi:
//		kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//		(Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

		Scanner s = new Scanner(System.in);
		ArrayList<ZeleniKarton> ispiti = new ArrayList<ZeleniKarton>();
		ZeleniKarton ispit = new ZeleniKarton();
		for (int i = 0; i < 10; i++) {
			System.out.println("Ime i prezime studenta: ");
			String imeIPrezime = s.next();
			ispit.setImeIPrezimeStudenta(imeIPrezime);
			System.out.println("Broj indexa: ");
			int broj = s.nextInt();
			ispit.setBrojIndeksa(broj);
			System.out.println("Predmet: ");
			String predmet = s.next();
			ispit.setPredmet(predmet);
			System.out.println("Profesor: ");
			String profesor = s.next();
			ispit.setImeIPrezimeProfesora(profesor);
			System.out.println("Ocena: ");
			int ocena = s.nextInt();
			ispit.setOcena(ocena);
			ispiti.add(ispit);

		}
		for (int i = 0; i < 10; i++) {

			System.out.println("Ime i prezime studenta: " + ispiti.get(i).getImeIPrezimeStudenta() + " Broj indeksa:  "
					+ ispiti.get(i).getBrojIndeksa() + " Predmet: " + ispiti.get(i).getPredmet() + " Profesor: "
					+ ispiti.get(i).getImeIPrezimeProfesora() + " Ocena: " + ispiti.get(i).getOcena());

		}

	}
}
