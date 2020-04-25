package Repl_Homeworks;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;



/*
 * Create a HashMap of String. 

Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all the values in upper case using entrySet 

Expected Output: 
265
22180
PATRICK ST
UNITED STATE
VIENNA
 */
public class Repl00201 {
public static void main(String[] args) {
	
	Map<String,String>cities=new HashMap<>();
	
	cities.put("Street","Patrick ST");
	cities.put("Suite","265");
	cities.put("City","Vienna");
	cities.put("Zip","22180");
	cities.put("Country","United State");
	
	Collection<String>city=cities.values();
	Iterator<String> it=city.iterator();
	while(it.hasNext()) {
		System.out.println(it.next().toUpperCase());
	}
	
	
	
}
}
