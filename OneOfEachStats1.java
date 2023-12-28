/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int t = Integer.parseInt(args[0]);
		int sum = 0, sumall = 0, count2 = 0, count3 = 0, count4 = 0;
		for (int i = 0 ; i < t ; i++) {
			boolean boy = false, girl = false;
			sum = 0;
				while (boy == false || girl == false) {
					double gender = (Math.random());
					sum++;
					if ( gender > 0.5) {
						boy = true;
					} else {
						girl = true;
					}
				}
			if (sum == 2) {
				count2++;
			} else if (sum == 3) {
				count3++;
			} else if (sum >= 4) {
			count4++;
			}
			sumall = sumall + sum;
		}
		double average = (double)(sumall / t);
		System.out.println ("Average: " + average + " children to get at least one of each gender.");
		System.out.println ("Number of families with 2 children: "+ count2);
		System.out.println ("Number of families with 3 children: "+ count3);
		System.out.println ("Number of families with 4  or more children: "+ count4);

		String mostcommon = "2.";
		if ((count3 > count2) && (count3 > count4)) {
			mostcommon = "3.";
		} else if ((count4 > count2) && (count4 > count2)) {
				mostcommon = "4 or more.";
		}
	System.out.println ("The most common number of children is "+ mostcommon);
}
}