package be.epsFamenneArdennes.poo.chris.devoirGestionMenu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

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

public class TestCommande {

	private static IPlat objIplatMenu1, objIplatMenu2, objIplatMenu3, objIplatMenu4;

	public TestCommande() {
	}

	@Test
	@BeforeAll
	public static void TestCreationMenu() {

		System.out.println("\t==>> Debut creation des menus");
		// creation du menu1
		objIplatMenu1 = PlatFactory.getPlat("viande", 21.5);
		objIplatMenu1 = new Frites(objIplatMenu1, objIplatMenu1.getPreparation(), 3.5);
		objIplatMenu1 = new Fruits(objIplatMenu1, objIplatMenu1.getPreparation(), 7.5);

		// creation du menu2
		objIplatMenu2 = PlatFactory.getPlat("volaille", 18.5);
		objIplatMenu2 = new PommesDeTerre(objIplatMenu2, objIplatMenu2.getPreparation(), 4.1);
		objIplatMenu2 = new Patisseries(objIplatMenu2, objIplatMenu2.getPreparation(), 6.0);

		// creation du menu3
		objIplatMenu3 = PlatFactory.getPlat("poisson", 22.3);
		objIplatMenu3 = new Pates(objIplatMenu3, objIplatMenu3.getPreparation(), 2.5);
		objIplatMenu3 = new PoussesCafes(objIplatMenu3, objIplatMenu3.getPreparation(), 5.5);

		// creation du menu4
		objIplatMenu4 = PlatFactory.getPlat("volaille", 18.5);
		objIplatMenu4 = new Riz(objIplatMenu4, objIplatMenu4.getPreparation(), 3.8);
		objIplatMenu4 = new Glaces(objIplatMenu4, objIplatMenu4.getPreparation(), 7.5);

		System.out.println("\t==>> Fin creation des menus\n");
	}

	@Test
	@Order(1)
	public void TestAddArrayListMenu() {

		Commandes objCmd = new Commandes("table01");

		/**
		 * tests ajout menu
		 */
		objCmd.addMenu(objIplatMenu1);
		assertEquals(objCmd.getArrayListMenu().size(), 1);
		System.out.println("\t==>> Test ajout menu 1 == ok");

		objCmd.addMenu(objIplatMenu2);
		assertEquals(objCmd.getArrayListMenu().size(), 2);
		System.out.println("\t==>> Test ajout menu 2 == ok \n");

		objCmd.addMenu(objIplatMenu3);
		assertEquals(objCmd.getArrayListMenu().size(), 3);
		System.out.println("\t==>> Test ajout menu 3 == ok \n");

		objCmd.addMenu(objIplatMenu4);
		assertEquals(objCmd.getArrayListMenu().size(), 4);
		System.out.println("\t==>> Test ajout menu 4 == ok \n");
		/**
		 * test menu1
		 */
		System.out.println("\n\t==>> *********************");
		System.out.println("\t==>> Test affichage menu 1");
		System.out.println("\t==>> *********************");
		String menuStr1 = "VIANDE :\n" + "\t==>> Piece de boeuf grillee au feu de bois ==>> 21.5 €.\n"
				+ "En accompagnement :\n" + "\t==>> Frites maison et cuitent à la graisse ==>> 3.5 €.\n"
				+ "Et comme dessert :\n" + "\t==>> Une coupe de fruits frais : 7.5 €."
				+ "\n\t==>> Le prix du menu : 32.5 €.";
		System.out.println(objIplatMenu1.toString());
		assertEquals(menuStr1, objIplatMenu1.toString());
		System.out.println("\n\t==>> Test affichage menu 1 == OK \n");

		System.out.println("\t==>> Test prix menu 1 ");
		System.out.println("\t==>> prix du menu " + objIplatMenu1.getPrix());
		assertEquals(32.5, objIplatMenu1.getPrix());
		System.out.println("\t==>> Test prix menu 1 == OK ");

		/**
		 * test menu 2
		 */
		System.out.println("\n\t==>> *********************  ");
		System.out.println("\t==>> Test affichage menu 2  ");
		System.out.println("\t==>> *********************  ");
		String menuStr2 = "VOLAILLE : \n" + "	==>> Poulet fermier grille au feu de bois ==>> 18.5 €.\n"
				+ "En accompagnement :\n"
				+ "	==>> Pommes de terre cuitent au four avec du romarin-ail-gros sel. ==>> 4.1 €.\n"
				+ "Et comme dessert :\n" + "	==>> Patisseries artisanales : 6.0 €."
				+ "\n\t==>> Le prix du menu : 28.6 €.";
		System.out.println(objIplatMenu2.toString());
		assertEquals(menuStr2, objIplatMenu2.toString());
		System.out.println("\n\t==>> Test affichage menu 2 == OK \n");

		System.out.println("\t==>> Test prix menu 2 ");
		System.out.println("\t==>> prix du menu " + objIplatMenu2.getPrix());
		assertEquals(28.6, objIplatMenu2.getPrix());
		System.out.println("\t==>> Test prix menu 2 == OK ");

		/**
		 * test menu 3
		 */
		System.out.println("\n\t==>> *********************  ");
		System.out.println("\t==>> Test affichage menu 3  ");
		System.out.println("\t==>> *********************  ");
		String menuStr3 = "POISSON : \n" + "	==>> Dorade grillee ==>> 22.3 €.\n" + "En accompagnement :\n"
				+ "	==>> Pâtes faites maison ==>> 2.5 €.\n" + "Et comme dessert :\n"
				+ "	==>> Liqueurs artisanales au choix : 5.5 €." + "\n\t==>> Le prix du menu : 30.3 €.";
		System.out.println(objIplatMenu3.toString());
		assertEquals(menuStr3, objIplatMenu3.toString());
		System.out.println("\n\t==>> Test affichage menu 3 == OK \n");

		System.out.println("\t==>> Test prix menu 3 ");
		System.out.println("\t==>> prix du menu " + objIplatMenu3.getPrix());
		assertEquals(30.3, objIplatMenu3.getPrix());
		System.out.println("\t==>> Test prix menu 3 == OK ");

		/**
		 * test menu 4
		 */
		System.out.println("\n\t==>> *********************  ");
		System.out.println("\t==>> Test affichage menu 4  ");
		System.out.println("\t==>> *********************  ");
		String menuStr4 = "VOLAILLE : \n" + "	==>> Poulet fermier grille au feu de bois ==>> 18.5 €.\n"
				+ "En accompagnement :\n" + "	==>> Riz Basmati ==>> 3.8 €.\n" + "Et comme dessert :\n"
				+ "	==>> Glaçes italienne artisanale : 7.5 €." + "\n\t==>> Le prix du menu : 29.8 €.";
		System.out.println(objIplatMenu4.toString());
		assertEquals(menuStr4, objIplatMenu4.toString());
		System.out.println("\n\t==>> Test affichage menu 4 == OK \n");

		System.out.println("\t==>> Test prix menu 4 ");
		System.out.println("\t==>> prix du menu " + objIplatMenu4.getPrix());
		assertEquals(29.8, objIplatMenu4.getPrix());
		System.out.println("\t==>> Test prix menu 4 == OK ");

	}

}
