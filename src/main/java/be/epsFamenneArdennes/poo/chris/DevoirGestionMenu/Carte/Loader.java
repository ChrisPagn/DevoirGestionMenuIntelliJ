package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Carte;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.lang.model.element.Element;
import javax.swing.text.Document;

import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class Loader {
/*


	/**
	 * creation objet document
	 */
	public Document document;

	/**
	 * creation objet element racine

	public Element racine;
	 */
	/**
	 * creation du constructeur + initialisation de la connexion au fichier xml +
	 * extraction du document et de la racine

	public Loader(String nomFichier) {
		SAXBuilder sxb = new SAXBuilder();
		try {
			document = sxb.build(new File(nomFichier));
		} catch (JDOMException | IOException e) {
			System.out.println("Erreur : " + e);
		}
		racine = document.getRootElement();
	}
	 */
	/**
	 * creation d'uen liste d'objets choix de catégorie plats

	public void creationPlats() {
		// creation d'une liste plats
		ArrayList<Choix> arrayListPlat = new ArrayList<>();

		// liste du noeud plats
		Element elPlats = racine.getChildren("plats").get(0);

		// recuperation des noeuds enfants de plats
		List listeTypes = elPlats.getChildren();

		// creation d'un iterator sur les noeuds enfants de plats
		Iterator it1 = listeTypes.iterator();
		while (it1.hasNext()) {
			Element elCategorie = (Element) it1.next();
			String type = elCategorie.getAttributeValue("id");
			// recuperation des noeuds enfants de categorie
			List listeCategorie = elCategorie.getChildren();
			Iterator it2 = listeCategorie.iterator();
			while (it2.hasNext()) {
				Element elPlat = (Element) it2.next();
				String categorie = elPlat.getName();
				String id = elPlat.getAttributeValue("id");
				String description = elPlat.getChildText("type");
				Double prix = Double.parseDouble(elPlat.getChildText("prix"));
				Choix objChoix = new Choix(id, categorie, type, prix, description);
				arrayListPlat.add(objChoix);
			}
		}
	}
	 */
	/**
	 * creation d'uen liste d'objets choix de catégorie accompagnements

	public void creationAccompagnements() {
		// creation d'une liste accompagnements
		ArrayList<Choix> arrayListAccompagnements = new ArrayList<>();

		// liste du noeud plats
		Element elAccompagnement = racine.getChildren("accompagnements").get(0);

		// recuperation des noeuds enfants de accompagnement
		List listeTypes = elAccompagnement.getChildren();

		// creation d'un iterator sur les noeuds enfants d'un accompagnement
		Iterator it1 = listeTypes.iterator();
		while (it1.hasNext()) {
			Element elCategorie = (Element) it1.next();
			String type = elCategorie.getAttributeValue("id");
			// recuperation des noeuds enfants de categorie
			List listeCategorie = elCategorie.getChildren();
			Iterator it2 = listeCategorie.iterator();
			while (it2.hasNext()) {
				Element elPlat = (Element) it2.next();
				String categorie = elPlat.getName();
				String id = elPlat.getAttributeValue("id");
				String description = elPlat.getChildText("type");
				Double prix = Double.parseDouble(elPlat.getChildText("prix"));
				Choix objChoix = new Choix(id, categorie, type, prix, description);
				arrayListAccompagnements.add(objChoix);
			}
		}
	}
	 */
	/**
	 * creation d'uen liste d'objets choix de catégorie desserts

	public void creationADesserts() {
		// creation d'une liste accompagnements
		ArrayList<Choix> arrayListDesserts = new ArrayList<>();

		// liste du noeud plats
		Element elDesserts = racine.getChildren("desserts").get(0);

		// recuperation des noeuds enfants de desserts
		List listeTypes = elDesserts.getChildren();

		// creation d'un iterator sur les noeuds enfants d'un desserts
		Iterator it1 = listeTypes.iterator();
		while (it1.hasNext()) {
			Element elCategorie = (Element) it1.next();
			String type = elCategorie.getAttributeValue("id");
			// recuperation des noeuds enfants de categorie
			List listeCategorie = elCategorie.getChildren();
			Iterator it2 = listeCategorie.iterator();
			while (it2.hasNext()) {
				Element elPlat = (Element) it2.next();
				String categorie = elPlat.getName();
				String id = elPlat.getAttributeValue("id");
				String description = elPlat.getChildText("type");
				Double prix = Double.parseDouble(elPlat.getChildText("prix"));
				Choix objChoix = new Choix(id, categorie, type, prix, description);
				arrayListAccompagnements.add(objChoix);
			}
		}
	}
	 */

	/**
	 * creation des getters et setters
	 * 
	 * @return

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public javax.swing.text.Element[] getRacine() {
		return racine;
	}

	public void setRacine(javax.swing.text.Element[] racine) {
		this.racine = racine;
	}
	 */
}
