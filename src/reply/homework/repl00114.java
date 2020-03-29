package reply.homework;

public class repl00114 {

	String spaceOut(String s) {
		char[] letters = s.toCharArray();
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			output = output + letters[i] + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		repl00114 obj = new repl00114();
		System.out.println(obj.spaceOut("hello"));
		System.out.println(obj.spaceOut("t e c h n o l o g y "));
	}
}