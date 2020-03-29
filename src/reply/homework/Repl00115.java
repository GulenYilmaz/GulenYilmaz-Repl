package reply.homework;

public class Repl00115 {

	String censorLetter(String a, char b) {
		 a= a.replace(b, '*');
		 return a;
	}
	public static void main(String[] args) {
		Repl00115 obj = new Repl00115();
		System.out.println(obj.censorLetter("computer science", 'e'));
		System.out.println(obj.censorLetter("trick or treat", 't'));
	}
}