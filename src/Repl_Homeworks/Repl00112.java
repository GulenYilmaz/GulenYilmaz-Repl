package Repl_Homeworks;

public class Repl00112 {

	
	
	    int a;
		int b;
		boolean bothEven(int a, int b) {     
			boolean bothEven;
			if(a%2==0 && b%2==0) {
				bothEven=true;
				System.out.println(bothEven);
			}else
				bothEven=false;
			System.out.println(bothEven);
			return bothEven;
		}
		
	
	
	public static void main(String[] args) {
	
	Repl00112	obj1=new Repl00112();
	
    obj1.bothEven(6,4);
	
	System.out.println(obj1.bothEven(6,4));
	
	
	
	
	
	
	
//	
//	boolean bothEven(int a, int b) {
//		if (a % 2 == 0 && b % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//	public static void main(String[] args) {
//	P112_ obj1 =new P112_();
//	System.out.println(obj1.bothEven(7, 4));
//
//	
//	
	
	
	
	
	
	}

}
