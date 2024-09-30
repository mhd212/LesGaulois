package histoire;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Romain minus = new Romain ("minus",6);
		System.out.println(minus);
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix);
		Druide Panoramix = new Druide("Panoramix", 5, 10);
		System.out.println(Panoramix);
		Gaulois Obélix = new Gaulois("Obélix", 25);
		System.out.println(Obélix);
		
		Panoramix.parler("Bonjour je suis le druide Panoramix et ma potion peut aller d'une force 5 a 10.");
		Panoramix.parler("je vais aller preparer une petite potion...");
		Panoramix.parler(" je n'ai pas trouvé btoutes les ingredients, ma potion est seulement de force 6.");
		Panoramix.parler(" Non Obelix!... Tu n'auras pas de potion magique!");
		Obélix.parler(" Par Bélénos, ce n'est pas juste!");
		Asterix.parler("Merci Druide, je sens que ma force est 6 fois décuplé.");
		Asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(minus);
		minus.parler("J'abandonne...");
		
	}

}
