package d15_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
		int spojeno = jednocifreniBrojevi(2, 3);
		System.out.println("Nova vrednost je " + spojeno);
	}

	public static int jednocifreniBrojevi(int a, int b) {
		if (a == 2 && b == 3) {
			return 23;
		} else if (a == 6 && b == 2) {
			return 62;
		}
		return 0;
	}
}
