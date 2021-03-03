
import java.util.Scanner;

public class Menus {
	
	Files files;
	int options;
	private static final String secondary = "Select any of the following options: \n" +
	" 1--> Add a file to the existing directory list\n"+ " 2--> Delete a user specified file from the existing directory list\n"+
			" 3--> Search a user specified file from the main directory\n"+ " 4--> Navigate back";
	
	public Menus()
	{
		this.files = new Files(Main.PATHNAME);
	}
	void showmenu()
	{
		System.out.println(secondary);
		try{
			Scanner sc= new Scanner(System.in);
			//i= sc.nextLine().toLowerCase().trim().toCharArray();
			options =sc.nextInt();
			
			switch(options)
			{
			case 1: {
				System.out.println(" -> Adding a new file in the directory list....");
				files.addnewFile(files.Input());
				showmenu();
				break;
			}
			case 2: {
				System.out.println(" -> Delete the file from existing directory list....");
				files.deleteFile(files.Input());
				showmenu();
			}
			case 3: {
				System.out.println(" -> Searching a file from the main directory...");
				files.searchFile(files.Input());
				showmenu();
			}
			case 4: {
				System.out.println("Navigate Back to Main screen");
				new LoginScreen(Main.PATHNAME).menu();
		}
			default: {
				System.out.println("Please enter any options 1,2,3 and 4");
				showmenu();
			}
			}
		}
		catch(Exception e)
		{
			System.out.println("Please enter any options 1,2,3 and 4");
			showmenu();	
		}
	}
}
