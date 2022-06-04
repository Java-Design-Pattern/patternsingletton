package patternSingleton;

public class Singleton {
	private static final Singleton theSingleton;
	private int compteur;
	static {
		theSingleton = new Singleton();
	}
	// interdiction d'instanciation par defaut
	private Singleton() {System.out.println("Instanciation Singleton ");}
	
	public static Singleton getInstance()
	{
		return theSingleton;
	}
	// en cas du multithread il faut garantir la synchronization 
	public synchronized void traiter(String taskName)
	{
		System.out.println("... Traitement de tache "+ taskName);

		for (int i = 1; i < 6; i++) {
			++compteur;
			System.out.println(".. "+compteur);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
		}
		System.out.println("... Fin de tache "+taskName+" compteur: "+compteur);
	}
	

}
