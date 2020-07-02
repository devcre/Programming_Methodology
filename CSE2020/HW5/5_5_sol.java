import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		int n;

		System.out.print("Please enter an integer:");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		
		
  	for (int i = 2; i <= n; i++) {
  			for (int j = 1; j <= i / 2; j++) {
  				if (i % j == 0) {
  					System.out.println("(" + i + "," + j + ")");
  				}
  			}
  		}
  }
}