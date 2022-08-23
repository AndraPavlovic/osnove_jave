package d22_08_2022;

public class Knjiga {
private String ISBN;
private String naziv;
private int godinaIzdanja;
private Autor autor;

public Knjiga(String iSBN, String naziv, int godinaIzdanja, Autor autor) {
	ISBN = iSBN;
	this.naziv = naziv;
	this.godinaIzdanja = godinaIzdanja;
	this.autor = autor;
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public String getNaziv() {
	return naziv;
}

public void setNaziv(String naziv) {
	this.naziv = naziv;
}

public int getGodinaIzdanja() {
	return godinaIzdanja;
}

public void setGodinaIzdanja(int godinaIzdanja) {
	this.godinaIzdanja = godinaIzdanja;
}

public Autor getAutor() {
	return autor;
}

public void setAutor(Autor autor) {
	this.autor = autor;
}
public void stampaj() {
	System.out.println(this.ISBN);
	System.out.println(this.naziv + " - " + this.godinaIzdanja);
	System.out.println(this.autor.getPunoIme());
}

}
