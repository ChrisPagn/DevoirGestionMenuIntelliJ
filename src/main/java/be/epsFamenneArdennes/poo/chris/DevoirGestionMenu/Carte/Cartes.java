package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Carte;

import java.util.ArrayList;
import java.util.Iterator;

public class Cartes {

	/**
	 * liste des choix des plats
	 */
	private ArrayList<Choix> arrayListPlat;

	/**
	 * liste des choix des accompagnements
	 */
	private ArrayList<Choix> arrayListAccompagnements;

	/**
	 * liste des choix des desserts
	 */
	private ArrayList<Choix> arrayListDesserts;

	/**
	 * creation des getters et setters
	 * 
	 * @return
	 */
	public ArrayList<Choix> getArrayListPlat() {
		return arrayListPlat;
	}

	public void setArrayListPlat(ArrayList<Choix> arrayListPlat) {
		this.arrayListPlat = arrayListPlat;
	}

	public ArrayList<Choix> getArrayListAccompagnements() {
		return arrayListAccompagnements;
	}

	public void setArrayListAccompagnements(ArrayList<Choix> arrayListAccompagnements) {
		this.arrayListAccompagnements = arrayListAccompagnements;
	}

	public ArrayList<Choix> getArrayListDesserts() {
		return arrayListDesserts;
	}

	public void setArrayListDesserts(ArrayList<Choix> arrayListDesserts) {
		this.arrayListDesserts = arrayListDesserts;
	}

	/**
	 * creation du constructeur par defaut
	 */
	public Cartes() {
		super();
	}

	/**
	 * creation du constructeur singelton
	 */
	public static Cartes getInstance() {
		return CarteHolder.INSTANCE;
	}

	/**
	 * singelton
	 */
	private static class CarteHolder {
		private static final Cartes INSTANCE = new Cartes();
	}

	/**
	 * selection d'un plat
	 */
	public Choix getPlat(String id) {
		Choix objPlat = null;

		Iterator<Choix> it = arrayListPlat.iterator();
		while (it.hasNext()) {
			Choix objChoix = (Choix) it.next();
			if (objChoix.getId().equals(id)) {
				objPlat = objChoix;
			}
		}
		return objPlat;
	}

	/**
	 * selection d'un accompagnement
	 */
	public Choix getAccompagnement(String id) {
		Choix objAccompagnement = null;

		Iterator<Choix> it = arrayListAccompagnements.iterator();
		while (it.hasNext()) {
			Choix objChoix = (Choix) it.next();
			if (objChoix.getId().equals(id)) {
				objAccompagnement = objChoix;
			}
		}
		return objAccompagnement;
	}

	/**
	 * selection d'un dessert
	 */
	public Choix getDessert(String id) {
		Choix objDessert = null;

		Iterator<Choix> it = arrayListDesserts.iterator();
		while (it.hasNext()) {
			Choix objChoix = (Choix) it.next();
			if (objChoix.getId().equals(id)) {
				objDessert = objChoix;
			}
		}
		return objDessert;
	}

}
