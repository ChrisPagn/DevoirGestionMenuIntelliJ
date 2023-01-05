package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Commandes;

import java.util.ArrayList;

import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.IPlat;

public class Commandes {
	/**
	 * creation des attributs
	 */
	private String numTable;
	private Double prixTtl = 0.0;
	private Double prixMenu = 0.0;

	/**
	 * creation de ma collection (List) pour le stockage des menus par table
	 */
	private ArrayList<IPlat> arrayListMenu;
//	private IPlat objIPlat;

	/**
	 * creation des getters et setters
	 * 
	 * @return
	 */
	public String getNumTable() {
		return numTable;
	}

	public void setNumTable(String numTable) {
		this.numTable = numTable;
	}

	public Double getPrixTtl() {
		return prixTtl;
	}

	public void setPrixTtl(Double prixTtl) {
		this.prixTtl = prixTtl;
	}

	public ArrayList<IPlat> getArrayListMenu() {
		return arrayListMenu;
	}

	public void setArrayListMenu(ArrayList<IPlat> arrayListMenu) {
		this.arrayListMenu = arrayListMenu;
	}

	/**
	 * creation du constructeur avec parametre numTable
	 * 
	 * @param numTable
	 */
	public Commandes(String numTable) {
		this.numTable = numTable;
		this.arrayListMenu = new ArrayList<>();
	}

	/**
	 * creation methode pour ajouter un menu
	 */
	public void addMenu(IPlat objIplatMenu) {
		this.arrayListMenu.add(objIplatMenu);
	}

	@Override
	public String toString() {
		return "Montant à payer pour la commande de la : " + getNumTable() + " ==>> prixTtl : " + getPrixTtl()
				+ " €.\n";
	}

	public double CalculPrixTotalMenu(IPlat objIplatMenu) {
		prixMenu += objIplatMenu.getPrix();
		return prixMenu;
	}

	public double CalculPrixTotalCmd() {
		for (IPlat iPlat : arrayListMenu) {
			prixTtl += iPlat.getPrix();
		}
		return prixTtl;
	}

	public void AfficheCommande() {
		int i = 1;

		System.out.println("\n==================== Commande ===================");
		System.out.println("==>> Pour la : " + getNumTable());
		for (IPlat iPlat : arrayListMenu) {
			System.out.println("\n==>> Menu: " + i);
			System.out.println(iPlat.toString());
			i++;
		}
		System.out.println("\n");
		CalculPrixTotalCmd();
		System.out.println(toString());
		System.out.println("=================================================");
	}

}
