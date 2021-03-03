
public class Main {
	
	final static String PATHNAME ="E://java test//Lockers.Pvt.Ltd/FilesData";
	public static void main(String a[])
	{
		System.out.println("\nDeveloped By : Neha Devi");
		System.out.println("\nProduct Name : LockedMe.com");
		
		System.out.println("\nDirectory Path : "+PATHNAME);
		
		LoginScreen login = new LoginScreen(PATHNAME);
		login.menu();
	}

}
