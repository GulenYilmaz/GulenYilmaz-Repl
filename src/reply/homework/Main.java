package reply.homework;

public class Main {
//	int a;
//	int b;
//	boolean bothEven(int a, int b) {     
//		boolean bothEven;
//		if(a%2==0 && b%2==0) {
//			bothEven=true;
//			System.out.println(bothEven);
//		}else
//			bothEven=false;
//		System.out.println(bothEven);
//		return bothEven;
//	}
//	
//	
//		public static void main(String[] args) {	
//
//		Main newObject=new Main();
//		
//		newObject.bothEven(-1,1);
//		
//		 
//}

//
//
//	int sumEvenToX(int x){
//	    
//		
//	    for (int i=1; i<=x; i++){
//	    	int sumEvenToX=0;
//	    	if(i%2==0){
//	    	sumEvenToX+=sumEvenToX+i; 
//	    	System.out.print(sumEvenToX);
//	    	}
//	     }
//		return x;
//	   
//	  }
//	  
//			public static void main(String[] args) {	
//
//			Main num=new Main();
//			
//			//num.sumEvenToX(5);
//			

	   String spaceOut(String str){
	    
		   String spaceOut="";
	  
		   for(int i=0; i<str.length(); i++){
	    
			   spaceOut=spaceOut+" ";
	    
			   System.out.println(spaceOut);
	  }
	    
	    
	    return spaceOut;
	  }
	  
	  public static void main(String[] args) {
	   
	    
	    Main str1=new Main();

	    str1.spaceOut("hello");
	    str1.spaceOut("technology");
	    
	    
	    
	    
	    
	    
	  }
	}
