package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random rand = new Random();
		int forcePotion = rand.nextInt(effetPotionMax);
		while (forcePotion < effetPotionMin) {
			forcePotion = rand.nextInt(effetPotionMax);
		}
		if (forcePotion > 7) {
			parler("J'ai préparé une super potion de force");
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force");
		}
		parler(String.valueOf(forcePotion));
		this.forcePotion = forcePotion;
		
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()== "Obelix") {
			parler(" Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		else {
		preparerPotion();
		gaulois.boirePotion(forcePotion);
		}
		
	}
	public static void main(String[] args) {
		Druide Panoramix = new Druide("jean", 5, 10);
		Panoramix.preparerPotion();
		
	}
}
