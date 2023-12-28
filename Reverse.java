/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String newS = "";
		int n= s.length()-1;
		while (n != -1) {
			char c = s.charAt(n);
			newS = newS + c;
			n = n-1;
			}
		char middle;
		if (s.length()%2==0) {
		middle =s.charAt(s.length()/2-1);
		}
		else {
		middle = s.charAt(s.length()/2);
		}
		System.out.println(newS);
		System.out.println("The middle character is " + middle);
	}
}
