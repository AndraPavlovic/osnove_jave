package d05_09_2022;
//Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:

// override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.

public class Menadzer extends Radnik {

	public double plata() {
		double plata = 0;
		for (int i = 0; i < this.getSektori().size(); i++) {
			plata = plata + this.getSektori().get(i).getPlata();
		}
		return plata;

	}
}
