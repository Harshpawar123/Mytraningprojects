package simplilearnFinalProject;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LockedMe 
{
	static final String projectFilesPath="C:\\My Assingment Projects\\MyFinalProjectPhase1\\LockedMeFiles";
	
	public static void displayMenu()
	   {
		   System.out.println("******************************************");
		   System.out.println("\tWelcome to LockedMe.com secure app");
		   System.out.println("\tDeveloped By : Harsh Pawar");
		   System.out.println("******************************************");
		   System.out.println("\t1 Display all files");
		   System.out.println("\t2 Add a new file ");
		   System.out.println("\t3 Delete a file");
		   System.out.println("\t4 Search file");
		   System.out.println("\t5 Exit");
		   System.out.println("******************************************");
		   
	   }
public static void getAllFiles ()
{
	File folder = new File(projectFilesPath);
	File[] listofFiles = folder.listFiles();
	
	if(listofFiles.length>0)
	{
		System.out.println("Files List Is Below:\n");
		for(var l:listofFiles)
		{
			System.out.println(l.getName());
		}
		
	}	
	else
	{
		System.out.println("The Folder Is Empty");
	}	
		
}

public static void createFiles ()
{
	try
	{
	Scanner obj = new Scanner (System.in);
	String fileName;
	System.out.println("Enter Te File Name");
	fileName=obj.nextLine();
	
	int linesCount;
	System.out.println("Enter how many lines in the file");
	linesCount=Integer.parseInt(obj.nextLine());
	
	FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName+".txt");
	
	for(int i=1;i<=linesCount;i++)
	{
		System.out.println("Enter file line:");
		fw.write(obj.nextLine()+"\n");
	}
	
	System.out.println("File Created Successfully");
	fw.close();
	}
	catch(Exception Ex)
	{
		
	}
	}

public static boolean checkFileExists(String fileName)
{
ArrayList<String> allFilesNames = new ArrayList<String>();
	
	File folder = new File(projectFilesPath);
	
    File[] listofFiles = folder.listFiles();
	
	if(listofFiles.length>0)
	{
		
		for(var l:listofFiles)
		{
			allFilesNames.add(l.getName());
		}
	}
	return allFilesNames.contains(fileName);
	
}
public static void deleteFiles ()
{
	Scanner obj = new Scanner (System.in);
	String fileName;
	System.out.println("Enter file name to be deleted:");
	fileName=obj.nextLine();
	File f = new File(projectFilesPath+"\\"+fileName);
	
	
	if (checkFileExists(fileName))
	{
		f.delete();
		System.out.println("Files Deleted Successfuly");
	}
	
	
	else
	{
		System.out.println("File doesnot exist");
	
	}	
	}
	


public static void searchFiles ()
{
	try
	{
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter file name to be searched");
	fileName=obj.nextLine();
	

	
	if (checkFileExists(fileName))
	{
		System.out.println("File is available");
	}
	else
	{
		System.out.println("File is not available");
	}
	
	}
	catch(Exception Ex)
	{
		
	}
	}
	
	
}


