/**
 * 
 */

/**
 * 
 */
public class Student {
	private String firstName;
	private String lastName;
	private String addressOne;
	private String addressTwo;
	private String GPA;
	
	
	public Student(String N1, String N2, String A1, String A2, String g)
	{
		firstName = N1;
		lastName = N2;
		addressOne = A1;
		addressTwo = A2;
		GPA = g;
	}
	

	public void setName1 (String N1)
	{
		firstName = N1;
		
	}
	public String getName1 ()
	{
		return firstName;
	}
	
	
	public void setName2 (String N2)
	{
		lastName = N2;
		
	}
	public String getName2 ()
	{
		return lastName;
	}
	
	
	public void setAddress1 (String A1)
	{
		addressOne = A1;
	}
	public String getAddress1 ()
	{
		return addressOne;
	}
	
	
	public void setAddress2 (String A2)
	{
		addressTwo = A2;
	}
	public String getAddress2 ()
	{
		return addressTwo;
	}
	
	
	public void setGPA (String GPAscore)
	{
		GPA = GPAscore;
	}
	public String getGPA ()
	{
		return GPA;
	}
	
	
	public void print ()
	{
		System.out.print(firstName + lastName + ", " + addressOne + ", " + addressTwo + ", " + GPA);
	}

}
