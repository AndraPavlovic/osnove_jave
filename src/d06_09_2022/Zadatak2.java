package d06_09_2022;

public class Zadatak2 {
	//U glavnom programu kreirati jedan planinarski dom, i u njemu učlaniti nekoliko rekreativnih planinara i nekoliko alpinista (minimum po 3), i istestirati svaku od metoda. 

	public static void main(String[] args) {
	
		PlaninarskiDom dom = new PlaninarskiDom("Dojkinci", 1950);
		Planina StaraPlanina = new Planina("Stara planina", "Srbija", 2376);

        dom.uclaniPlaninara(new RekreativniPlaninar("842", "Andrija Pavlovic", 
        6, "Nisavski", 1200));
		dom.uclaniPlaninara(new RekreativniPlaninar("334", "Nikola Nikolic",
		9, "Pirotski", 1500));
		dom.uclaniPlaninara(new RekreativniPlaninar("865", "Pera Peric", 
		4, "Jablanicki", 900));
		
		dom.uclaniPlaninara(new Alpinista("785", "Jovana Jovanovic", 65));
		dom.uclaniPlaninara(new Alpinista("832", "Ivana Ivanovic", 35));
		dom.uclaniPlaninara(new Alpinista("923", "Petar Petrovic", 53));
		
		for ( int i = 0; i < dom.getClanovi().size(); i++ ) {
			dom.getClanovi().get(i).uspon(StaraPlanina);
		}
		
		dom.print();
		System.out.println(StaraPlanina.getIme() + " " + 
		StaraPlanina.getVisina() + " m nadmorske visine");
		System.out.println(dom.brojPlaninaraKojiSePopeli(StaraPlanina));
		System.out.println(dom.mesecniPrihod());
		
	}

}
