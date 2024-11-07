package histoires;

import personnages.Humain;
import personnages.principaux.*;


public class MonHistoire {

	public static void main(String[] args) {
		System.out.println("----START-----");
		//HUMAN
//		Humain h = new Humain( "Toto",  101 , "juice");
//		h.parler("hello");
//		h.direBonjour();
//		h.boire();
//		h.gagnerArgent(100);
//		System.out.println(h.getArgent());
//		h.perdreArgent(50);
//		System.out.println(h.getArgent());
		//MERCHANT
		Merchant m = new Merchant("Jojo", 100);
		m.direBonjour();
		m.boire();
		
		
//		System.out.println(m.getArgent());
//		m.perdreArgent(50);
//		System.out.println(m.getArgent());
//		
//		int s = m.seFaireExtorquer();
//		System.out.println(s);
//		
//		m.recevoir(100);
//		System.out.println(m.getArgent());
		
		//YAKUZA
		Yakuza y = new Yakuza("Jojoy Yaku", 100, "black tea", "Nipon");
		y.direBonjour();
		y.boire();
		y.extorquer(m); 
		
		//RONIN
		Ronin r = new Ronin("Samourai of light", 100, "green tea");
		r.direBonjour();
		r.boire();
		r.provoquer(y);
		r.donner(200, m);
		
		System.out.println(m.getArgent());
		System.out.println(y.getArgent());
		System.out.println(r.getArgent());
		
		
	}

}
