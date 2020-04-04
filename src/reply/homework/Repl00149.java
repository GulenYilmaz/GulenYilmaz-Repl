
package reply.homework;
/*
 * 1. Create three classes (A, B, C)

Write two constructors:

* Have a default constructor that prints out the following
For A:  "I"
For B: "am"
For C: "a tester"

Make C extend B
and B extend A

From your Main class create an object of the C class.

Expected Output:
I
am
a tester
 */
public class Repl00149 {
	Repl00149(){
		System.out.println("I");
	}
} 
class B extends  Repl00149{
	B(){
		System.out.println("am");
	}
}
class C extends B{
	C(){
		System.out.println("a tester");
	}
}