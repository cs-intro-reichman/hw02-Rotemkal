/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false, girl = false;
		int sum = 0;
		String answer = ""; 
		while (boy == false || girl == false) {
			double gender = (Math.random());
			sum = sum + 1;
				if ( gender > 0.5 ) {
					answer = answer + "b ";
					boy = true;
				}
				else {
					girl = true;
					answer = answer + "g ";
				}
		}
		System.out.println (answer);
		System.out.println ("You made it ... and you now have "+ sum + " children.");
}
}