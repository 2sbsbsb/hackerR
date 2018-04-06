package thirty_days_code.day4;

import java.util.Scanner;

/**
 * Solution to https://www.hackerrank.com/challenges/30-class-vs-instance/problem
 *
 */
public class Person {
	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		if (initialAge < 0) {
			age = 0;
			System.out.println("Age is not valid, setting age to 0.");
		} else {
			age = initialAge;
		}
	}

	public void amIOld() {
		String ans = "";
		// Write code determining if this person's age is old and print the
		// correct statement:
		if (age < 13) {
			ans = "young";
			System.out.println("You are " + ans + ".");
		} else if (age < 18) {
			ans = "teenager";
			System.out.println("You are a " + ans + ".");
		} else {
			ans = "old";
			System.out.println("You are " + ans + ".");
		}

	}

	public void yearPasses() {
		// Increment this person's age.
		age += 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}