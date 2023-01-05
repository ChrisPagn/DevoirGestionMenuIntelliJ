package be.epsFamenneArdennes.poo.chris.devoirGestionMenu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Frites;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Pates;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.PommesDeTerre;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Accompagnement.Riz;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.IPlat;
import be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat.PlatFactory;

public class TestPlatAccompagnement {

	@Test
	@Order(1)
	public void testPoissonPates() {

		/**
		 * creation objet plat
		 */
		IPlat objIplatPoisson = PlatFactory.getPlat("poisson", 20);
		/**
		 * creation objet accompagnement
		 */
		objIplatPoisson = new Pates(objIplatPoisson, objIplatPoisson.getPreparation(), 4.1);

		System.out.println("===>>> Test menu 1 :");
		System.out.println("===>>> Debut test Poisson + Pâtes:");

		System.out.println("===>>> resultat de la comparaison description et du prix du poisson : ");
		System.out.println(objIplatPoisson.getPreparation());
		assertEquals(
				"POISSON : \n" + "\t==>> Dorade grillee ==>> 20.0 €.\n" + "En accompagnement :\n"
						+ "\t==>> Pâtes faites maison ==>> 4.1 €.\n\n\t==>> Le prix du menu : 24.1 €.",
				objIplatPoisson.toString());

		assertEquals(24.1, objIplatPoisson.getPrix());
		System.out.println("===>>> test prix : OK ");
		System.out.println("===>>> test Poisson + Pâtes == ok \n");

	}

	@Test
	@Order(2)
	public void testViandeFrites() {

		/**
		 * creation objet plat
		 */
		IPlat objIplatViande = PlatFactory.getPlat("viande", 23);

		/**
		 * creation objet accompagnement
		 */
		objIplatViande = new Frites(objIplatViande, objIplatViande.getPreparation(), 5.0);

		System.out.println("===>>> Test menu 2 :");
		System.out.println("===>>> Debut test Viandes + Frites:");

		System.out.println("===>>> resultat de la comparaison description et du prix du poisson : ");
		System.out.println(objIplatViande.getPreparation());
		assertEquals(
				"VIANDE :\n" + "	==>> Piece de boeuf grillee au feu de bois ==>> 23.0 €.\n" + "En accompagnement :\n"
						+ "	==>> Frites maison et cuitent à la graisse ==>> 5.0 €.\n\n\t==>> Le prix du menu : 28.0 €.",
				objIplatViande.toString());

		assertEquals(28.0, objIplatViande.getPrix());
		System.out.println("===>>> test prix : OK");
		System.out.println("===>>> Test Viandes + Frites == ok \n");
	}

	@Test
	@Order(3)
	public void testVolailleRiz() {

		/**
		 * creation objet plat
		 */
		IPlat objIplatVolaille = PlatFactory.getPlat("volaille", 18);

		/**
		 * creation objet accompagnement
		 */
		objIplatVolaille = new Riz(objIplatVolaille, objIplatVolaille.getPreparation(), 3.5);

		System.out.println("===>>> Test menu 3 :");
		System.out.println("===>>> Debut test Volaille  + Riz :");

		System.out.println("===>>> resultat de la comparaison description et du prix du poisson : ");
		System.out.println(objIplatVolaille.getPreparation());
		assertEquals(
				"VOLAILLE : \n" + "	==>> Poulet fermier grille au feu de bois ==>> 18.0 €.\n" + "En accompagnement :\n"
						+ "	==>> Riz Basmati ==>> 3.5 €.\n\n\t==>> Le prix du menu : 21.5 €.",
				objIplatVolaille.toString());

		assertEquals(21.5, objIplatVolaille.getPrix());
		System.out.println("===>>> test prix : OK");
		System.out.println("===>>> Test test Volaille  + Riz == ok \n");
	}

	@Test
	@Order(4)
	public void testPoissonPdt() {

		/**
		 * creation objet plat
		 */
		IPlat objIplatPoisson = PlatFactory.getPlat("poisson", 20);

		/**
		 * creation objet accompagnement
		 */
		objIplatPoisson = new PommesDeTerre(objIplatPoisson, objIplatPoisson.getPreparation(), 4.1);

		System.out.println("===>>> Test menu 4 :");
		System.out.println("===>>> Debut test Poisson + Pommes de terre :");

		System.out.println("===>>> resultat de la comparaison description et du prix du poisson : ");
		System.out.println(objIplatPoisson.getPreparation());
		assertEquals("POISSON : \n" + "	==>> Dorade grillee ==>> 20.0 €.\n" + "En accompagnement :\n"
				+ "	==>> Pommes de terre cuitent au four avec du romarin-ail-gros sel. ==>> 4.1 €.\n\n\t==>> Le prix du menu : 24.1 €.",
				objIplatPoisson.toString());

		assertEquals(24.1, objIplatPoisson.getPrix());
		System.out.println("===>>> test prix : OK");
		System.out.println("===>>> test Poisson + Pommes de terre == ok \n");
	}

}
