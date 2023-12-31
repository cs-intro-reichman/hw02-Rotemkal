/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		boolean stop = false;
		int rand1 = (int)(Math.random() * 10);
		System.out.println(rand1);
		while (stop != true) {
			int rand2 = (int)(Math.random() * 10);
			if (rand2 > rand1) {
				System.out.println(rand2);
				rand1=rand2;
			}
			else {
				stop = true;
			}
		}
	}
}
