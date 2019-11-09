// *****
// *
// *
// *
// *****


import java.util.*;
class C{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your row values: \n");
		int row = sc.nextInt();
		//now print to pattern
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=row ;j++ ) {
				if (i==1||j==1||i==row) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}