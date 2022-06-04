package patternSingleton;



public class Application {
public static void main(String[] args)
{
	System.out.println("***** PATTERN SINGLETON *****");
	for (int i = 1; i < 6; i++) {
		Singleton s = Singleton.getInstance();
		s.traiter("Task"+i);
	}
	
}
}
