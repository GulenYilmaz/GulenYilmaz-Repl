package reply.homework;
/*For you to do:

Create class A
declare variable int i=10;

Create class B  extends A
declare variable int i=20;

create a method to display value of variable i from both classes

In Main Class create an object of subclass and call method display

Expected Output:
20
10
 */
class Repl00150 {

	int i=10;
	void display(int i) {
		this.i=i;
		System.out.println(i);
	}
	
}
class BB extends Repl00150{
	int i=20;
	void display(int i){
		super.i=i;
		System.out.println(i);
	}
}
