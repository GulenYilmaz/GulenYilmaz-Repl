package Repl_Homeworks;
import java.util.*;


/*
 * Create a student class that will have 
variables as studentId, name and lastName
constructor
method to display students details

Create a set that will store 5 different students in an order they been added to the collection.

Execute method to display students details

Expected Output:
Student details: Samir Jawaid with id: 101
Student details: Asel Umurzakova with id: 102
Student details: Diego Juarez with id: 103
Student details: Sohil Aryan with id: 104
Student details: Alijon Nazarov with id: 105
 */
public class Repl00194 {
	
	String name;
	String lastName;
	String studentId;
	
	public Repl00194(String name,String lastName,String studentId){
		this.lastName=lastName;
		this.name=name;
		this.studentId=studentId;
	}
	
	
	public void display() {
		System.out.println("Student details: "+name+" "+lastName+"with id: "+studentId);
	}

	
	
	public static void main(String[] args) {
	
	Set<Repl00194> student=new LinkedHashSet<>();
	
	student.add(new Repl00194("Samir", "Jawaid", "101"));
	student.add(new Repl00194("Asel", "Umurzakova","102"));
	student.add(new Repl00194("Diego", "Juarez","103"));
	student.add(new Repl00194("Sohil"," Aryan","104"));
	student.add(new Repl00194("Alijon","Nazarov","105"));
	
	for(Repl00194 s:student) {
		s.display();
	}
}
}
