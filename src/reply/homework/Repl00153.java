package reply.homework;
/*
 * For you to do:

Overload instance method display 
by having different types of parameters
Inside each method write the logic to 
print value of the parameter

Call all methods inside your main method

Expected Output:
100
Syntax Technologies
100.09

 */
public class Repl00153 {
	
	void sub(int a){
		System.out.println(a);
		
	}void sub(String str){
		System.out.println(str);
		
	}void sub(double x){
		System.out.println(x);
		
	}
	public static void main(String[] args) {
		
		Repl00153 obj=new Repl00153();
		obj.sub(100);
		obj.sub("Syntax Technologies");
		obj.sub(100.09);
	}
}
