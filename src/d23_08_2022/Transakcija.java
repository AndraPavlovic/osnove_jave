package d23_08_2022;

public class Transakcija {
	private int id;
	private Racun uplatilac;
	private Racun primalac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getUplatilac() {
		return uplatilac;
	}

	public void setUplatilac(Racun uplatilac) {
		this.uplatilac = uplatilac;
	}

	public Racun getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Racun primalac) {
		this.primalac = primalac;
	}

	public Transakcija() {
	}

	public Transakcija(int id, Racun uplatilac, Racun primalac) {
		this.id = id;
		this.uplatilac = uplatilac;
		this.primalac = primalac;

	}

	public void izvrsiTrans(int iznos) {
		this.uplatilac.menjaStanjeRacunaUplatioca(iznos - 45);
		this.primalac.menjajStanjePrimaoca(iznos);
	}

	public void stampaj() {
		System.out.println(this.id);
		System.out.println("Racun sa: " + this.uplatilac.getImeIPrezime() + " " + this.uplatilac.getBrojRacuna());
		System.out.println("Racun na: " + this.primalac.getImeIPrezime() + " " + this.primalac.getBrojRacuna());
	}
}
