package Repl_Homeworks;

import java.util.HashMap;
import java.util.Map;

/*Create a Map in which you do not need to preserve the order of the entries
Add below pair to it . 

"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Find how many entries are inside the map
Remove all entires from the Map
Find the Map size again

Expected Output:
5
0
 */
public class Repl00196 {
public static void main(String[] args) {
	
	Map<String,String>cities=new HashMap<>();
	
	cities.put("Street","Patrick ST");
	cities.put("Suite","265");
	cities.put("City","Vienna");
	cities.put("Zip","22180");
	cities.put("Country","United State");
	
	System.out.println(cities.size());
	cities.clear();
	System.out.println(cities.size());
}
}
