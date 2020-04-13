package Repl_Homeworks;

//For you to do:
//
//Create the maxLength method that will accept 
//String array of words and return the word with the largest length.
//
//Method should visible only within same package!
//
//Expected Output:
//this is long

public class Repl00134 {

	

		public static String maxLength(String [] arr){
			String maxLength = arr[0];
			for(int i=0; i<arr.length; i++){
		 if(arr[i].length()> maxLength.length() ){
		   maxLength=arr[i];
		 }
			}
			return maxLength;
		}

	public static void main(String[] args) {
		String[] arr = { "hey", "yolo", "hi", "this is long" };
		System.out.println(maxLength(arr));
		// should print "this is long"
	}

}