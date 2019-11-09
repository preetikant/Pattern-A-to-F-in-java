
import java.util.*;
class G{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your row values: ");
		int row = sc.nextInt();
		//now print to pattern
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=row ;j++ ) {
				if (i==1||j==1||j==row||i==) {
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