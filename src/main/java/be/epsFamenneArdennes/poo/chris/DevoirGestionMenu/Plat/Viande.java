package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat;

public class Viande implements IPlat {

	/**
	 * creation des attributs
	 */
	protected double prix;
	protected String type;

	/**
	 * creation des setters & getters
	 */
	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getType() {
		return type.toUpperCase() + " :\n";
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * creation des constructeur par default
	 */
	public Viande() {
		super();
	}

	/**
	 * creation du contructeur avec parametre
	 * 
	 * @param type
	 */
	public Viande(String type) {
		super();
		this.type = type;
	}

	/**
	 * creation du contructeur avec parametres
	 * 
	 * @param type
	 * @param prix
	 */
	public Viande(String type, double prix) {
		super();
		this.type = type;
		this.prix = prix;
	}

	/**
	 * creation methodes description du plat Viandes
	 */
	public String getPreparation() {
		return getType() + "\t==>> Piece de boeuf grillee au feu de bois ==>> " + prix + " €.\n";

	}

	@Override
	public String toString() {
		return getPreparation();
	}

}
