/**

 * 
 */


/**
 * 
 */

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Application {

	/**
	 * @author Jayden West
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File aFile = new File("ProgramOutput.txt");
		FileWriter fw = new FileWriter(aFile);
		PrintWriter pw = new PrintWriter(fw);
		Scanner scnr = new Scanner(System.in);
		Scanner myReader = new Scanner(aFile);
		StudentRoster SR = new StudentRoster();
		
		int choice = 0;
		int counter = 0;
		
		
		System.out.println("1: Make Student Roster 2: Search Student Roster");
		int choiceVar = scnr.nextInt();
		if (choiceVar == 1)
		{
			
		while (choice == 0)
			{ 
			
	
				System.out.println("Enter students first name: ");
				String firstN = scnr.next();
				System.out.println("Enter students last name: ");
				String lastN = scnr.next();
				System.out.println("Enter students first address: ");
				scnr.nextLine();
				String a1 =scnr.nextLine();
				System.out.println("Enter students second address: ");
				String a2 = scnr.nextLine();
				System.out.println("Enter students GPA: ");
				String gpa = scnr.next();
				
				Student S = new Student(firstN, lastN, a1, a2, gpa);
				SR.addStudent(S);
				
				System.out.println("Add another Student?");
				System.out.println("0=yes 1=no");
				choice = scnr.nextInt();
				counter++;
				
				
			}
		
		SR.printer();
		for (int i = 0; i < counter; i++)
		{
			pw.printf(SR.ToString() + "\n");
			
		}
		pw.close();
		System.out.println("File Printed");
		
		}
		else if (choiceVar ==2)
		{
			if (aFile.exists())
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
			else
			{
				System.out.println("no file seen");
			}
		}
		
	
		
		

	}

}
