package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String name, int argent, String boisson) {
		super(name, argent, boisson);
		honneur = 1;
	}
	
	public void donner(int n, Merchant c) {
		c.recevoir(n);
		perdreArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		if (honneur*2 > y.getReputation()) {
			int a = y.perdreDuel();
			gagnerArgent(a);
			honneur++;
			String b = "VICTOIRE!";
			parler(b);
			
		} else {
			y.gagnerDuel();
			honneur--;
			String p = "Ugh j'ai perdu face a ce Yakuza!";
			parler(p);
			
		}
	}
	
}
