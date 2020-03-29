package reply.homework;

public class Reply0079 {

	public static void main(String[] args) {
		/*
		 * For you to do:
Write a program to print values from a 2D array

Example Output:
1.4 2.0 3.3 2.0 
4.0 1.5 6.1 1.0 
1.2 3.1 4.0 1.6 
		 */

		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			//prints array
		for(int i=0;i<a.length; i++) {
		for (int j=0;j<a[i].length; j++) {
		System.out.print(a[i][j]+" ");
		
		}System.out.println();
		}
		
	}

}
