/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String newS = "";
		// #feedback: better to use for loop here
		for (int i = n-1; i>=0 ; i--) {
			// #feedback: can use (x += n) equivalent to ( x = x + n)
			newS += s.charAt(i);
		}
		/*
  			#feedback:
     			That condition is not required.
			When you use integers 7/2 = 3 = 6/2
			You did not have to seperate cases.
		*/
		char middle =s.charAt(s.length()/2);
		System.out.println(newS);
		System.out.println("The middle character is " + middle);
	}
}
