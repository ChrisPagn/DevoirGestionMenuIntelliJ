package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat;

public class Volaille implements IPlat {

	/**
	 * creation des attributs
	 */
	protected double prix;
	protected String type;

	/**
	 * creation des setters & getters
	 */
	public double getPrix() {
		return this.prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getType() {
		return type.toUpperCase() + " : \n";
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setType(String type, double prix) {
		this.type = type;
		this.prix = prix;
	}

	/**
	 * creation des constructeur par default
	 */
	public Volaille() {
		super();
	}

	/**
	 * creation des constructeur avec parametre
	 * 
	 * @param type
	 */
	public Volaille(String type) {
		super();
		this.type = type;
	}

	/**
	 * creation des constructeur avec parametres
	 * 
	 * @param type
	 * @param prix
	 */
	public Volaille(String type, double prix) {
		super();
		this.type = type;
		this.prix = prix;
	}

	/**
	 * creation methodes description du plat Volaille
	 */
	public String getPreparation() {
		return getType() + "\t==>> Poulet fermier grille au feu de bois ==>> " + prix + " €.\n";

	}

	@Override
	public String toString() {
		return getPreparation();
	}

}
