package d22_08_2022;

public class Autor {
private String punoIme;

public Autor(String punoIme) {
	this.punoIme = punoIme;
}

public String getPunoIme() {
	return punoIme;
}

public void setPunoIme(String punoIme) {
	this.punoIme = punoIme;
}
public void stampaj() {
	System.out.println(this.punoIme);
}

}
