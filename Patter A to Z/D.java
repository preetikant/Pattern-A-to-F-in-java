// *****
// *   *
// *   *
// *   *
// *****





import java.util.*;
class D{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your row values: \n");
		int row = sc.nextInt();
		//now print to pattern
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=row ;j++ ) {
				if (i==1 || j==1 || i==row || j==row) {
					System.out.print("*");
				}
				else if(i==row-1 && j==row){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}