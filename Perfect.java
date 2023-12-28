/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		String num = args[0];
		String answer = num + " is a perfect number since "+ num + " = 1";
		int sum = 1;
		for (int i = 2; i < n; i++) {
			if (n%i==0) {
			answer = answer + " + "+i;
			sum = sum + i;
			}
		}
	if (sum == n) {
		System.out.println(answer);
	}
	else {
		System.out.println( n + " is not a perfect number");
	}
}
}