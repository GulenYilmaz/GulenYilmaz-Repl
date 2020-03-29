package reply.homework;

public class Reply0080 {

	public static void main(String[] args) {
		/*Write a program to double the values of every element in the array and print it out.

Example Output:
2.8 4.0 6.6 4.0 
8.0 3.0 12.2 2.0 
2.4 6.2 8.0 3.2
		 * 
		 */
//		double[][] a = {
//				{1.4,2.0,3.3,2},
//				{4,1.5,6.1,1},
//				{1.2,3.1,4,1.6}
//			};
//			
//			//Double and print array
//		
//		for(int i=0;i<a.length; i++) {
//			for (int j=0;j<a[i].length; j++) {
//			System.out.print((a[i][j])*2+" ");
//			
//			}System.out.println();
//			}
	/*For you to do:
Write a program that prints the highest value in the array.

Expected Output:
8
	 * 
	 */
//
//		int[][] b = {
//			{5,2,3,7},
//			{1,5,1,1},
//			{8,3,1,2}
//		};
//		int max= b [0][0] ;
//        
//		for(int i=0;i<b.length; i++) {
//	    for(int j=0; j<b[i].length; j++) {
//	    
//	    	if(max<b[i][j] ) {
//		 max=b[i][j];
//		  } }
//        } System.out.println(max);
	/*
	 * For you to do:
Write a program that will print the sum of all elements in 2D array. 

Expected Output:
-9
	 */
//		
//		int[][] a = {
//				{-5,-2,-3,7},
//				{1,-5,-2, 2},
//				{1,-2, 3,-4}
//			};
//			
//		int sum= 0;
//      
//		for(int i=0;i<a.length; i++) {
//	    for(int j=0; j<a[i].length; j++) {
//	    
//		 sum=sum+(a[i][j]);
//		   }
//      } System.out.println(sum);
//		
//		
		
		/*For you to do:
Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

For example, if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
4
6
11
3            */
		
		int[][] nums = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
		
		int sums[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < nums[i].length; j++) {
				rowSum += nums[i][j];
			}
			sums[i] = rowSum;
		}
		for (int sum : sums) {
			System.out.println(sum);
		}
         
	
} 	
}