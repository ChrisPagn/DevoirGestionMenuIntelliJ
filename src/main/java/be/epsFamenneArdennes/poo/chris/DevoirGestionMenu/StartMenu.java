package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu;

import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Frites;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Pates;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.PommesDeTerre;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Riz;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Commandes.Commandes;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Dessert.Fruits;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Dessert.Glaces;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Dessert.Patisseries;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Dessert.PoussesCafes;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.IPlat;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.PlatFactory;

public class StartMenu {
	public static void main(String[] args) {

		/**
		 * creation des objets des plats principaux
		 */
		Commandes objCmd = new Commandes("table01");

		IPlat objIplatPoisson = PlatFactory.getPlat("poisson", 20);
		IPlat objIplatPoisson1 = PlatFactory.getPlat("poisson", 20);
		IPlat objIplatViande = PlatFactory.getPlat("viande", 23);
		IPlat objIplatVolaille = PlatFactory.getPlat("volaille", 18);

		/**
		 * creation des objets des accompagnements des plats principaux
		 */
		objIplatPoisson = new Pates(objIplatPoisson, objIplatPoisson.getPreparation(), 5.5);
		objIplatPoisson1 = new PommesDeTerre(objIplatPoisson1, objIplatPoisson1.getPreparation(), 4.1);
		objIplatViande = new Riz(objIplatViande, objIplatViande.getPreparation(), 3.5);
		objIplatVolaille = new Frites(objIplatVolaille, objIplatVolaille.getPreparation(), 5.0);

		objIplatPoisson = new Fruits(objIplatPoisson, objIplatPoisson.getPreparation(), 6.5);
		objIplatPoisson1 = new Glaces(objIplatPoisson1, objIplatPoisson1.getPreparation(), 7.5);
		objIplatViande = new Patisseries(objIplatViande, objIplatViande.getPreparation(), 8.5);
		objIplatVolaille = new PoussesCafes(objIplatVolaille, objIplatVolaille.getPreparation(), 8.5);

		/**
		 * creation commandes table2
		 */
		Commandes objCmd2 = new Commandes("table02");

		IPlat objIplatPoisson3 = PlatFactory.getPlat("poisson", 20);
		IPlat objIplatPoisson4 = PlatFactory.getPlat("poisson", 20);
		IPlat objIplatViande2 = PlatFactory.getPlat("viande", 29);
		IPlat objIplatVolaille2 = PlatFactory.getPlat("volaille", 18);

		/**
		 * creation des objets des accompagnements des plats principaux
		 */
		objIplatPoisson3 = new Riz(objIplatPoisson3, objIplatPoisson3.getPreparation(), 5.5);
		objIplatPoisson4 = new PommesDeTerre(objIplatPoisson4, objIplatPoisson4.getPreparation(), 4.1);
		objIplatViande2 = new Pates(objIplatViande2, objIplatViande2.getPreparation(), 3.5);
		objIplatVolaille2 = new Frites(objIplatVolaille2, objIplatVolaille2.getPreparation(), 5.0);

		objIplatPoisson3 = new PoussesCafes(objIplatPoisson3, objIplatPoisson3.getPreparation(), 6.5);
		objIplatPoisson4 = new Glaces(objIplatPoisson4, objIplatPoisson4.getPreparation(), 7.5);
		objIplatViande2 = new Patisseries(objIplatViande2, objIplatViande2.getPreparation(), 8.5);
		objIplatVolaille2 = new Fruits(objIplatVolaille2, objIplatVolaille2.getPreparation(), 8.5);

		/**
		 * affichage des plat principaux avec les accompagnements
		 */
		System.out.println("\nDebut creation commandes table01 : \n");

//		System.out.println("===>>> 1 : " + objIplatPoisson.getPreparation());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 2 : " + objIplatPoisson1.getPreparation());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 3 : " + objIplatViande.getPreparation());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 4 : " + objIplatVolaille.getPreparation());

		System.out.println("\nFin creation commandes table01\n");

		objCmd.addMenu(objIplatPoisson);
		objCmd.addMenu(objIplatPoisson1);
		objCmd.addMenu(objIplatViande);
		objCmd.addMenu(objIplatVolaille);
		objCmd.AfficheCommande();

		System.out.println("\nDebut creation commandes table02 : \n");

//		System.out.println("===>>> 1 : " + objIplatPoisson3.toString());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 2 : " + objIplatPoisson4.toString());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 3 : " + objIplatViande2.toString());
//
//		System.out.println("=========================================================================\n");
//
//		System.out.println("===>>> 4 : " + objIplatVolaille2.toString());

		System.out.println("\nFin creation commandes table02\n");

		objCmd2.addMenu(objIplatPoisson3);
		objCmd2.addMenu(objIplatPoisson4);
		objCmd2.addMenu(objIplatViande2);
		objCmd2.addMenu(objIplatVolaille2);
		objCmd2.AfficheCommande();

//		System.out.println(objCmd.CalculPrixTotal());

	}
}
