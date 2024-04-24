
public class StudentRoster {
	private Student[] sR;
	private int count;
	private int printcount = -1;
	 public StudentRoster()
	 {
		 sR = new Student[5];
		 count = 0;
	 }
	 
	public void addStudent(Student s)
	{
		sR[count] = s;
		count++;
	}
	
	public String ToString()
	{
		printcount++;
		return sR[printcount].getName1() + " " + sR[printcount].getName2() + "," + sR[printcount].getAddress1() + "," + sR[printcount].getAddress2() + "," + sR[printcount].getGPA();
		
		
	}
	
	public void printer()
	{
		for (int i = 0; i < count; i++)
			System.out.println(sR[i].getName1() + " " + sR[i].getName2() + "," + sR[i].getAddress1() + "," + sR[i].getAddress2() + "," + sR[i].getGPA());
	}
	
	
	
	
	
	
}

