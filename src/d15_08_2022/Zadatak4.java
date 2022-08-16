package d15_08_2022;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Zadatak
		// Napisati metodu koja stampa podatke o korisniku u formatu:
		// JMBG: [jmbg]
		// Ime: [ime]
		// Prezime: [prezime]
		// God. rodjenja: [god]
		// Aktivan: [true/false]
		// Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao
		// parametre metode.Metoda nista ne vraca.
		jmbg("2431401353");
		ime("Andrija");
		prezime("Prezime");
		godRodjenja("1995");
		aktivan(true);
	}

	public static void jmbg(String jmbg) {
		System.out.println("JMBG: " + jmbg);
	}

	public static void ime(String ime) {
		System.out.println("Ime: " + ime);
	}

	public static void prezime(String prezime) {
		System.out.println("Prezime: " + prezime);
	}

	public static void godRodjenja(String godRodjenja) {
		System.out.println("Godina rodjenja: " + godRodjenja);
	}

	public static void aktivan(boolean aktivan) {
		System.out.println("Aktivan: " + aktivan);
	}
}
