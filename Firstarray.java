package topicArrays;

import java.util.Scanner;

public class Firstarray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
       //taking length from the user
		int j = sc.nextInt();
		int[] a = new int[j];

		for (int i = 0; i <= j - 1; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = j - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		sc.close();
	}

}
