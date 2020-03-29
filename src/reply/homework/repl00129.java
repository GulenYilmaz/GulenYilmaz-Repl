package reply.homework;

//a String
//Name:
//surround
//Parameters:
//a String called s
//a String called search_term
//
//Then complete the method by programming the following behavior
//Return a new String built from s 
//that has every instance of the search term surrounded by parentheses
//See below examples.
//
//Examples:
//surround("abcabcabc",'c') ==> "ab(c)ab(c)ab(c)"
//surround("technology",'o') ==> "techn(o)l(o)gy"

public class repl00129 {
	
	
	
		    static String surround(String s, String search_term){
		 
			String str=s.replaceAll(String.valueOf(search_term),"("+search_term+")");
					
			return str;	
					
		    }	
			//test case below (dont change):
			public static void main(String[] args){
				
				System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
				System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
			}
		}




