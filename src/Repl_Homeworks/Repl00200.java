package Repl_Homeworks;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Create a Map that will preserve an order of entry objects
Add below pair to it . 
"Street" = "Patrick ST"
"Suite" = "265"
"City" = "Vienna"
"Zip" = "22180"
"Country" = "United State"

Print all values using iterator

Expected output:
Patrick ST
265
Vienna
22180
United State
 */
public class Repl00200 {

	public static void main(String[] args) {

		Map<String,String>cities=new LinkedHashMap<>();
		
		cities.put("Street","Patrick ST");
		cities.put("Suite","265");
		cities.put("City","Vienna");
		cities.put("Zip","22180");
		cities.put("Country","United State");
		
		Collection<String>city=cities.values();
		Iterator<String> it=city.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
