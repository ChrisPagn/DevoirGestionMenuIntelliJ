package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat;

public class PlatFactory {

	/**
	 * creation du constructeur par defaut
	 */
	public PlatFactory() {
	}

	/**
	 * creation methode getPlat (Factory des plats principaux)
	 * 
	 * @param type
	 * @param prix
	 * @return
	 */
	public static IPlat getPlat(String type, double prix) {
		if (type.equals(null)) {
			return null;
		}
		switch (type.toLowerCase()) {
		case "poisson":
			return new Poisson(type, prix);
		case "viande":
			return new Viande(type, prix);
		case "volaille":
			return new Volaille(type, prix);
		}
		return null;
	}
}
