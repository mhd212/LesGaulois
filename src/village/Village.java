package village;

import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;

	public Village(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		this.nbVillageois = 0;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
			System.out.println("Le village est plein !");
		}
	}

	public Gaulois trouverHabitant(int numero) {
		if (numero >= 0 && numero < nbVillageois) {
			return villageois[numero];
		} else {
			throw new IllegalArgumentException("Aucun villageois trouvé pour ce numéro !");
		}
	}

	public void afficherVillageois() {
		System.out.println("Chef du village : " + chef);
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("Villageois " + (i + 1) + ": " + villageois[i]);
		}
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles", 30);

		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);

		village.setChef(abraracourcix);

		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);

		village.afficherVillageois();

		Gaulois gaulois = village.trouverHabitant(1);
		System.out.println("Habitant trouvé : " + gaulois);
	}
}
