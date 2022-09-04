package mini_projekat;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
//		Ucitati podatke za igrace
//		Kreirajte objekat klase XandOGame 
//		Startujte igru, tada je na potezu igrac X
//		Saveti za dobar zadatak
//		Igra treba da traje dok (while petlja)
//		nije kraj igre - imamo metodu za to
//		Ili dok ne dobijemo pobednika
//		U petlji
//		Trazimo od aktuelnog igraca da unese potez
//		Ukoliko je pozicija validna i ako je to slobodno mesto, igramo potez
//		Prebacujemo red na drugog igraca
//		Stampamo tablu
//		Ukoliko nije validna pozicija ili nije slobodno mesto stampamo poruku "You enter invalid position."
//		Nakon zavrsetka igre, racunamo skor i stampamo rezultat igre i podatke za igrace

		Scanner s = new Scanner(System.in);

		Player player1 = new Player("Andrija Pavlovic");
		Player player2 = new Player("Nikola Nikolic");
		XandOGame game = new XandOGame(player1, player2);

		game.startGame();

		while (game.isGameOver() == false && game.isWinnerO() == false && 
				game.isWinnerX() == false) {
			if (game.player().equals("x")) {
				System.out.println(player1.getPunoIme() + " je na potezu. Unesite polje:");
			} else {
				System.out.println(player2.getPunoIme() + " je na potezu. Unesite polje:");
			}
			int polje = s.nextInt();
			if (game.isValidMove(polje) == false || game.isFieldFree(game.table, polje)
					== false) {
				System.out.println("Nevalidan potez");
				game.playNext();
			} else {
				game.makeAMove(polje);
			}
			if (game.gameScore() == 1) {
				System.out.println("Pobednik je " + player1.getPunoIme());
			} else if (game.gameScore() == 2) {
				System.out.println("Pobednik je " + player2.getPunoIme());
			}

			game.playNext();
			game.print();

		}
	}

}
