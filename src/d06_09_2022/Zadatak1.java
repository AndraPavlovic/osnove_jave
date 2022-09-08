package d06_09_2022;

public class Zadatak1 {
	// U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza
	// razlicitih tipova i istestirati sve metode i ispisati ukupnu cenu sa
	// popustom.

	public static void main(String[] args) {
		Korpa k = new Korpa();
		Tetrapak mleko = new Tetrapak(true, 60);
		Tetrapak jogurt = new Tetrapak(false, 50);

		StaklenaAmbalaza pivo = new StaklenaAmbalaza(10, true, 80);
		StaklenaAmbalaza kisela = new StaklenaAmbalaza(15, true, 50);

		k.dodajAmbalazu(mleko);
		k.dodajAmbalazu(jogurt);
		k.dodajAmbalazu(pivo);
		k.dodajAmbalazu(kisela);

		SuperKartica sk = new SuperKartica(7695, "Andrija Pavlovic", 50);

		k.cenaSvih(sk);

		System.out.println("Ukupna cena sa popustom je:  " + k.cenaSvih(sk));
	}
}
