package personnages;

public class Humain {
	private String name;
	private int argent;
	private String boisson;
	
	public Humain(String name, int argent, String boisson) {
		this.name = name;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public String getName() {
		return name;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public void parler(String text) {
		String name = getName();
		String p =  "( "+ name + " )" + " -  "+ text ;
		System.out.println(p);
	}
	
	public void direBonjour() {
		String b = "Bonjour ! Je m’appelle " + getName() + " et j’aime boire du " + getBoisson() ;
		parler(b);
		
	}
	
	public void boire() {
		String b = "Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !" ;
		parler(b);
	}
	
	public void gagnerArgent(int n) {
		argent += n;
	}
	
	public void perdreArgent(int n ) {
		argent -= n;
	}
	
}
