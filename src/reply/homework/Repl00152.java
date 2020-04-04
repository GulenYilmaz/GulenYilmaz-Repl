package reply.homework;
/*
 * Create 3 overloaded methods to perform subtraction of  2, 3 and 4 numbers
In main method execute all 3 methods to match the output:
 
Expected Output
40 (should come from subtracting 4 numbers)
30 (should come from subtracting 3 numbers)
20 (should come from subtracting 2 numbers)

 */
public class Repl00152 {

	void sub(int a, int b){
		System.out.println(a-b);
		
	}void sub(int a, int b, int c){
		System.out.println(a-b-c);
		
	}void sub(int a, int b, int c, int d){
		System.out.println(a-b-c-d);
		
	}
	public static void main(String[] args) {
		
		Repl00152 obj=new Repl00152();
		obj.sub(50, 5, 3, 2);
		obj.sub(40, 5, 5);
		obj.sub(30, 10);
	}
}
