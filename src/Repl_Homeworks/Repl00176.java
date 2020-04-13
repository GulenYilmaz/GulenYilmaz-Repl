package Repl_Homeworks;
/*
 * Encapsulation
Create the a Person class with the following:
Class Variables
firstname
lastname
birthmonth
birthday
birthyear
String ssn

Constructor
The main constructor should take in all values and assign them to their respective private class variables

Methods
Create a public getters to access all the variables. 

Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

in Main Class. 

Instantiate and object of Person and provide values. follows below outputs for values. 

using getter and method print them separately. 
Note: Read carefully the steps. 

Expected Output:
John
Doe
10/25/1900
123-45-6789
 */
public class Repl00176 {
public static void main(String[] args) {
		
		Perso obj=new Perso(null, null, null, null, null);
		
		obj.setFirstname("John");
		obj.setLastname("Doe");
		
		obj.setSsn("123-45-6789");
		
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastname());
		obj.formatBirthday("10","25","1900");
		System.out.println(obj.getSsn());
				
				
				
				
				
				
				
			
		 
	}
	


}
class Perso{
	private String firstname;
	
	private String lastname;
	private String birthmonth;
	private String birthday;
	private String birthyear;
	private String ssn;
	Perso(String lastName,String birthmonth,String birthday,String birthyear,String ssn){
		this.lastname=lastname;
		this.firstname=firstname;
		this.birthmonth=birthmonth;
		this.birthday=birthday;
		this.birthyear=birthyear;
		this.ssn=ssn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	public String formatBirthday(String birthmonth,String birthday,String birthyear) {
		this.birthmonth=birthmonth;
		this.birthday=birthday;
		this.birthyear=birthyear;
		System.out.println(birthmonth+"/"+birthday+"/"+birthyear);
		return birthday;
	}
}
