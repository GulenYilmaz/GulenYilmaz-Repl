package reply.homework;

public class Reply0084 {

	public static void main(String[] args) {
		/* For you to do:
        Write a program that sums all numbers that are on even index and on even row.

        Expected Output:
        -4*/
	
	
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			 
		int sum=0;
		for(int i=0; i<3; i+=2){
			
			for(int j=0; j<3; j+=2){
		    
				if(i%2==0 && j%2==0){
			    sum=a[i][j];
		    	sum=sum+i;
	          }
		} 
		  System.out.println(sum);}

}
}