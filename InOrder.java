/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		/* 
  			#feedback: 
     			- Classic case to use do-while loop
			- Use meaningfull names
   			- bad use of boolean - if you put boolean in condition line, you might use the variable or it negative without comparision.
      			- You created a condition to break a loop instead of using the abstract condition to keep iterating - that's a very bad usage.
		*/
		boolean stop;
		int last = 0;
		int next = (int)(Math.random() * 10);
		do {
			System.out.println(next);
			last = next;
			next = (int)(Math.random() * 10);
			stop = next < last;
		} while (!stop);
	}
}
