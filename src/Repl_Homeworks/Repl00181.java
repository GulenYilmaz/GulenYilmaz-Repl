package Repl_Homeworks;

import java.util.ArrayList;

public class Repl00181 {
	public static void main(String[] args){
		ArrayList<String> arrlist=new ArrayList<>();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
		arrlist.remove(0);
		arrlist.remove(1);
		arrlist.remove(2);
		
		for (String object : arrlist) {
			System.out.print(object+" ");
		}
	}
}