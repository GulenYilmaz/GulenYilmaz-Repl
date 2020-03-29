package reply.homework;
//Declare a static variable number that will hold an integer value:
//
//Access number from the main method and assign value to it.
//Create an Object of the class, access number in a nonstatic way and assing value of 200.
//
//Print out number using class name and using instance
//
//Expected Output:
//200
//200
public class repl00121 {
	
	
	static int num;
	
	
	public static void main(String[] args) {

		repl00121 obj= new repl00121();
		
	    
		obj.num=200;
		System.out.println(obj.num);
		System.out.println(repl00121.num);
		
		
	}

	
	

}


