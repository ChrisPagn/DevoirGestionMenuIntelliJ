package be.epsFamenneArdennes.poo.chris.DevoirGestionMenu.Plat;

public abstract class PlatDecorator implements IPlat {

	/**
	 * creation de mon attribut de type IPlat
	 */
	protected IPlat objPlatDecore;

	/**
	 * creation du constructeur par defaut
	 */
	public PlatDecorator() {
		super();
	}

	/**
	 * creation du constructeur avec parametre
	 * 
	 * @param platDecore
	 */
	public PlatDecorator(IPlat platDecore) {
		super();
		this.objPlatDecore = platDecore;
	}

}
