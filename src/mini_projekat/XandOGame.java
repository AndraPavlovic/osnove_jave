package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
//	Kreirati klasu XandOGame koja ima:
//		table - niz koji cuva stanje igre. Npr: table = x, x, 0, 0, x, 0, x, 0, x
//		nextPlayer - atribut koji cuva informaciju ko igra sledeci. Moze da ima vrednosti x ili o
//		playerX - igrac X
//		playerO - igrac O
//		Difoltni konstuktor koji u niz dodaje 9 elemenata. Svaki element u nizu je “ “
//		Kontuktor koji prima dva parametra, igraca x i igraca o i ovaj kontuktor radi sve sto radi i difoltni samo sto dodatno postavlja i igraca
//		gettere i settere za igrace
//		Metodu print koja stampa tablu sliku kao na slici. Stampanje se vrsi petljom. Ako je niz iz primera iznad stampa izgleda:
//		x | x | 0 |
//		0 | x | 0 |
//		x | 0 | x |
	ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		super();
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
	}

	public XandOGame(Player player1, Player player2) {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		this.playerX = player1;
		this.playerO = player2;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public void print() {
		for (int i = 0; i < this.table.size(); i++) {
			System.out.print(this.table.get(i) + "|");
			if (i == 2 || i == 5) {
				System.out.println();
			}

		}
	}

//	Metodu startGame, metoda postavlja sve elemente niza na prazan string “ “ i zatim postavlja da je na redu igrac X.
//	Metodu isGameOver, igra je gotova ako su sva polja popunjena.
//	Metodu isFieldFree, koja vraca da li je trazeno polje slobodno. Metoda od parametara prima niz i poziciju za kojju se proverava. Polje je slobodno ako u njemu ne pise x ili o
//	Metodu playNext, metoda prebacuje potez na sledeceg igraca, ako je bio igrac x prebacuje ga na o i obrnuto
//	Metodu makeAMove, metoda prima poziciju gde moze da odigra potez.
//	Ako je trenutno stanje u igri i sledeci na redu je igrac x

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		if (this.table.contains(" ")) {
			return false;
		}
		return true;
	}

	public boolean isFieldFree(ArrayList<String> table, int pozicija) {
		if (table.get(pozicija).equals("x") || table.get(pozicija).equals("o")) {
			return false;
		}
		return true;
	}

	public String player() {
		if (this.nextPlayer.equals("x")) {
			return "x";
		} else {
			return "o";
		}
	}

	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int polje) {
		if (this.isFieldFree(table, polje)) {
			if (this.nextPlayer.equals("x")) {
				table.set(polje, "x");
			} else if (this.nextPlayer.equals("o")) {
				table.set(polje, "o");
			}
		}
	}
//	Metodu isWinnerX - metoda vraca rezultat igre za igraca X. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isWinnerO -  metoda vraca rezultat igre za igraca O. Pobednik je ukoliko prosledjeni igrac ima 3 vezana svoja znaka ili po koloni ili po redu ili po dijgonalama
//	Metodu isValidMove koja vraca informaciju da li je pozicija na koju igrac zeli da odigra potez validna. Pozicija je validna ako je u opsegu od 0 do 8
//	Metodu gameScore, metoda vraca informaciju za kraj igre.
//	Ukoliko je pobednik igrac x, metoda vraca 1
//	Ukoliko je pobednik igrac o, metoda vraca 2
//	Ukoliko nemam pobednika vracamo 0

	public boolean isWinnerX() {
		if (table.get(0).equals("x") && table.get(1).equals("x") && table.get(2).equals("x")) {
			return true;
		} else if (table.get(3).equals("x") && table.get(4).equals("x") && table.get(5).equals("x")) {
			return true;
		} else if (table.get(6).equals("x") && table.get(7).equals("x") && table.get(8).equals("x")) {
			return true;
		} else if (table.get(0).equals("x") && table.get(3).equals("x") && table.get(6).equals("x")) {
			return true;
		} else if (table.get(1).equals("x") && table.get(4).equals("x") && table.get(7).equals("x")) {
			return true;
		} else if (table.get(2).equals("x") && table.get(5).equals("x") && table.get(8).equals("x")) {
			return true;
		} else if (table.get(0).equals("x") && table.get(4).equals("x") && table.get(8).equals("x")) {
			return true;
		} else if (table.get(2).equals("x") && table.get(4).equals("x") && table.get(6).equals("x")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinnerO() {
		if (table.get(0).equals("o") && table.get(1).equals("o") && table.get(2).equals("o")) {
			return true;
		} else if (table.get(3).equals("o") && table.get(4).equals("o") && table.get(5).equals("o")) {
			return true;
		} else if (table.get(6).equals("o") && table.get(7).equals("o") && table.get(8).equals("o")) {
			return true;
		} else if (table.get(0).equals("o") && table.get(3).equals("o") && table.get(6).equals("o")) {
			return true;
		} else if (table.get(1).equals("o") && table.get(4).equals("o") && table.get(7).equals("o")) {
			return true;
		} else if (table.get(2).equals("o") && table.get(5).equals("o") && table.get(8).equals("o")) {
			return true;
		} else if (table.get(0).equals("o") && table.get(4).equals("o") && table.get(8).equals("o")) {
			return true;
		} else if (table.get(2).equals("o") && table.get(4).equals("o") && table.get(6).equals("o")) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isValidMove(int polje) {
		if (polje >= 0 || polje <= 8) {
			return true;
		} else {
			return false;
		}
	}

	public int gameScore() {
		if (this.isWinnerX() == true) {
			return 1;
		} else if (this.isWinnerO() == true) {
			return 2;
		}
		return 0;
	}
}
