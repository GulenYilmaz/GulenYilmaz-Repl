package reply.homework;


	public class Repl00114 {

		String spaceOut(String s) {
			char[] letters = s.toCharArray();
			String output = "";
			for (int i = 0; i < s.length(); i++) {
				output = output + letters[i] + " ";
			}
			return output;
		}

		public static void main(String[] args) {
			Repl00114 obj = new Repl00114();
			System.out.println(obj.spaceOut("hello"));
			System.out.println(obj.spaceOut("t e c h n o l o g y "));
		}
	}