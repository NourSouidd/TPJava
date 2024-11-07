package personnages.principaux;

import personnages.Humain;


public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	
	public Yakuza(String name, int argent, String boisson, String clan) {
		super(name, argent, boisson);
		this.clan = clan;
		reputation = 0;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Merchant m) {
		int a = m.seFaireExtorquer();
		gagnerArgent(a);
		reputation--;
		String p = "Haha cet argent me serait plus utile! ";
		parler(p);
		
	}
	
	public void gagnerDuel() {
		reputation++;
		String p = "VICTOIRE!";
		parler(p);
	}
	
	public int perdreDuel() {
		int a = getArgent();
		perdreArgent(a);
		reputation--;
		String p = "Ugh j'ai perdu face a ce Ronin!";
		parler(p);
		return a;
		
	}
	
	@Override 
	public void direBonjour() {
		super.direBonjour();
		String t = "Je fais partie du clan des " + getClan();
		parler(t);
	}
}
