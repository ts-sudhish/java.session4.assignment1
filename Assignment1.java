/**
 * 
 */
package sdh.java.session4;

import java.util.Scanner;

/**
 * @author Sudhish
 *
 */
public class Assignment1 {

	public static void main(String[] args) {
		Scanner in = new Scanner( System.in );
		System.out.println("Enter size of array: ");
		int arraySize = Integer.parseInt(in.nextLine());
		String[] elements = new String[arraySize];
		System.out.println("Enter all the elements: ");
		for (int i = 0; i < elements.length; i++) {
			elements[i] = in.next();
		}
		System.out.println("Entered array is : ");
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i] + "\t");
		}
		System.out.println("Entered array in reverse order : ");
		for (int i = elements.length-1; i >=0; i--) {
			System.out.println(elements[i]+"\t");
		}
	}

}
