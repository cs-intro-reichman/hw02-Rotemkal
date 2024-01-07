/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		// #feedback: when you set multiple variables with initial value, it better to sepeate their declartion within row for each.
		boolean boy = false;
		boolean girl = false;
		int sum = 0;
		String answer = ""; 
		// #feedback: better to not compare boolean variables and use them or their negative as the result of condition
		while (!boy || !girl) {
			double gender = (Math.random());
			// #feedback: better to use sum++ which is equivalent to sum += 1 or sum = sum + 1
			sum++;
			if ( gender > 0.5 ) {
				answer = answer + "b ";
				boy = true;
			} else {
				girl = true;
				answer = answer + "g ";
			}
		}
		System.out.println (answer);
		System.out.println ("You made it ... and you now have "+ sum + " children.");
}
}
