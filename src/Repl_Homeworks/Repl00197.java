package Repl_Homeworks;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Create A Map that will preserve an order of entry objects

Add below pairs :

"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all values of from the map 

Expected Output:
Patrick ST
265
Vienna
22180
United State
 */
public class Repl00197 {
public static void main(String[] args) {
	
Map<String,String>cities=new LinkedHashMap<>();
	
	cities.put("Street","Patrick ST");
	cities.put("Suite","265");
	cities.put("City","Vienna");
	cities.put("Zip","22180");
	cities.put("Country","United State");
	
	Collection<String>city=cities.values();
	for(String c:city) {
		System.out.println(c);
	}
	
}
}
