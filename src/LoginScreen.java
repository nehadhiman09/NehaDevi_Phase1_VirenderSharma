
import java.util.Scanner;

public class LoginScreen {
	int options;
	Files files;
	private static final String PROMPT = "Login Screen--> Select any of the following features: \n" +
	"\n1 --> List File in the directory \n" + "2 --> Add, Delete or Search \n" + "3 --> Close the application \n";
	
	public LoginScreen(String pathname)
	{
		files= new Files(pathname);
	}
	
	void menu()
	{
		System.out.println("\n"+ PROMPT);
	
	try{
		Scanner sc= new Scanner(System.in);
		options=sc.nextInt();
		
		switch(options)
		{
			case 1: {
			
			files.displayFilesList();
			menu();
			
					}
			
			case 2: {
			new Menus().showmenu();
					}
			
			case 3: {
			System.out.println("Thank You");
			System.exit(0);
					}
			
			default: {
			menu();
					}
		
		}
	}
	
	catch(Exception e){
		System.out.println("Please enter the options 1 ,2 and 3\n");
		menu();
	}
}
}