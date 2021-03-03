import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Files {

	
	private final File pathname;
	Scanner sc;
	
	public Files(String pathname) {
		this.pathname= new File(pathname);
		sc= new Scanner(System.in);
	}
	
	public void displayFilesList()
	{
		String[] list= pathname.list();
		
		if(list == null)
			System.out.println("No files in the directory");
		else
		{
			System.out.println("File Path: " + pathname +" are :\n");
			Arrays.sort(list);
			for(String str: list)
			{
				System.out.println(str);
			}
		}
	}
	
	void addnewFile(String filename) throws IOException
	{
		File file = new File(pathname+"/"+filename);
		
		if(file.createNewFile())
		{
			System.out.println("\""+filename+"\" added to " + pathname.getCanonicalPath());
			System.out.println("New File is created sucessfully in..."+"\n");
		}
			else if(file.exists())
			{	
				System.out.println("File already exist..." +"\n");
			}
			else
			
				System.out.println("Something went wrong. File not added in " + pathname +"\n");
			}
			
		
		void deleteFile(String filename)
		{
			File file = new File(pathname+"/"+filename);
			
			if(file.delete())
			{
			
				System.out.println("File deleted successfully..."+"\n");
			}	
			
				else
				
					System.out.println("File not Found(FNF) \n");
			
				}
		
		void searchFile(String filename)
		{
			File file = new File(pathname+"/"+filename);
			
			if(file.exists())
			{
				System.out.println("File found successfully..."+"\n");
			}
			else
			
				System.out.println("Search not Found \n");
			}
		public String Input()
		{
			
		System.out.println("Please enter the filename:");
		try{
			String filename= sc.nextLine().toLowerCase().trim();
			if(filename.equals(""))
				return Input();
			else
				return filename;
		}
		catch(Exception e)
		{
			System.out.println("Something  went wrong");
		}
		return Input();
	
	}

}
