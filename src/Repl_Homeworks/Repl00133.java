package Repl_Homeworks;

//Create a method that will be available to all classes 
//in your project with following specifications:
//
//Returns:
//a String
//Name:
//alphabetical
//Parameters:
//a String called str
//Purpose:
//Return a string that is composed of each letter as long as the letter is later on in the alphabet
//than its previous one.  You can assume actual parameters are lowercase.
//See below examples.
//
//Additional Info:
//You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:
//'a' < 'b' ==> True
//'a' < 'a' ==> False
//'a' > 'b' ==> False

//Examples:
//alphabetical("hello") ==> "hlo"
//alphabetical("software") ==> "stwr"
//alphabetical("language") ==> "lnug"

public class Repl00133 {

	public static String alphabetical(String str) {
		String str1="";
	str1=str.toLowerCase();
	str1=str1.replaceAll("[aeoiu]","");
		
	return str1;	
	} 
	
	//test case below (dont change):
		public static void main(String[] args){
			System.out.println(alphabetical("hello")); //"hlo"
			System.out.println(alphabetical("software")); 
			System.out.println(alphabetical("language"));
		}
	}