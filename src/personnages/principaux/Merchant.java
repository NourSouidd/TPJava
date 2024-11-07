package personnages.principaux;

import personnages.Humain;

public class Merchant extends Humain {
	
	public Merchant(String name, int argent) {
		super(name, argent, "tea");
		
	}
	
	public void sePlaindre() {
		String b = "Oh non, on m'a extorqué! Le monde est si injuste!" ;
		this.parler(b);
	}
	
	public int seFaireExtorquer() {
		int a = getArgent();
		perdreArgent(a);
		sePlaindre();
		return a;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		String s = "Merci Ronin pour cet argent!";
		parler(s);
	}


}
