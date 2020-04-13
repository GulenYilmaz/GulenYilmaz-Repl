package Repl_Homeworks;


/*1. Create four classes (Person, Employee, Student, Retiree)

* Have properties
For Person: name(String)
For Person: lastName(String)
For Person: age(int)
For Employee: salary(int)
For Student: grade(int)
For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.


Expected Output: 
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour*/


public class Repl00144 {
	String name;
	String lastName;
	int age;
	}

	
    class Employee extends Repl00144 {
	int salary;

		void print1(String name, String lastName, int age, int salary) {
			this.salary = salary;
			this.name=name;
			this.lastName=lastName;
			this.age=age;
			System.out.println(this.name + " " + this.lastName + " " + this.age + " " + this.salary);
	}
	}
	
	class Student extends Employee {
	int grade;

			void print2(String name, String lastName, int age, int grade) {
				this.grade = grade;
				System.out.println(name + " " + lastName + " " + age + " " + this.grade);
				
				
	}
	}
			
	class Retiree extends Student {
	String seniorActivity;

					void print3(String name, String lastName, int age, String seniorActivity) {
						this.seniorActivity = seniorActivity;
						System.out.println(name + " " + lastName + " " + age + " " + this.seniorActivity);
					}
				}
			
	
	    class Testrepl {
        public static void main(String[] args) {
			Employee emp = new Employee();
			emp.print1("Joe","Smith",35,35000);
			
			
			Student student = new Student();
			student.print2("Adam","Smith",15,10);
			
			Retiree retiree = new Retiree();
			retiree.print3("Frank","Smith",15,"tour");
		}
	}
