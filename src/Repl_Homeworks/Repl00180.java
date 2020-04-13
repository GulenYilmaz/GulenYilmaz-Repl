package Repl_Homeworks;
import java.util.ArrayList;
public class Repl00180 {
	
		 public static void main(String[] args) {
				
				
				
				
				ArrayList< Integer> str=new ArrayList<>();
			
				str.add(111);
				str.add(222);
				str.add(333);
				str.add(444);
				str.add(555);
				str.add(666);
				
				for(int i=0; i<str.size(); i++) {
					int num=str.get(i);
					System.out.println(num);
				}
				str.removeAll(str);
			
				System.out.println(str);
		 }}	
