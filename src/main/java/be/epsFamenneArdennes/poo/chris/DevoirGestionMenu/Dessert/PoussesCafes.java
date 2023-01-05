package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Dessert;

import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.IPlat;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.PlatDecorator;

public class PoussesCafes extends PlatDecorator {

	/**
	 * creation des attributs
	 */
	protected Double prix;
	protected String type;

	/**
	 * creation des getters & setters
	 */
	@Override
	public String getPreparation() {
		return objPlatDecore.getPreparation() + "Et comme dessert :\n" + getType();
	}

	@Override
	public void setPrix(double prix) {
		this.prix = prix;
	}

	@Override
	public double getPrix() {
		// platDecorator.getPrix() +
		return objPlatDecore.getPrix() + this.prix;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getType() {

		return "\t==>> Liqueurs artisanales au choix : " + prix + " €.";
	}

	/**
	 * creation du constructeur par default
	 */
	public PoussesCafes() {
		super();
	}

	/**
	 * creation du constructeur avec parametres
	 * 
	 * @param platDecore
	 * @param type
	 * @param prix
	 */
	public PoussesCafes(IPlat platDecore, String type, Double prix) {
		super(platDecore);
		this.prix = prix;
		this.type = type;
	}

	@Override
	public String toString() {
		return getPreparation() + "\n\t==>> Le prix du menu : " + getPrix() + " €.";
	}

}
