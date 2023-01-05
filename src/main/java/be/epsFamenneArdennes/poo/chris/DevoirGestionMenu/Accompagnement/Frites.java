package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement;

import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.IPlat;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.PlatDecorator;

public class Frites extends PlatDecorator {

	/**
	 * creation des attributs
	 */
	protected double prix;
	protected String type;

	/**
	 * creation du contructeur par defaut
	 */
	public Frites() {
		super();
	}

	/**
	 * creation du contructeur avec parametres
	 * 
	 * @param platDecore
	 */
	public Frites(IPlat platDecore, String type, Double prix) {
		super(platDecore);
		this.type = type;
		this.prix = prix;
	}

	/**
	 * creation des getters & setters
	 */
	@Override
	public String getPreparation() {
		return objPlatDecore.getPreparation() + "En accompagnement :\n" + getType();
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
		return "\t==>> Frites maison et cuitent à la graisse ==>> " + prix + " €.\n";
	}

	@Override
	public String toString() {
		return getPreparation() + "\n\t==>> Le prix du menu : " + getPrix() + " €.";
	}

}
