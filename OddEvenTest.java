import java.util.Scanner;

	public class OddEvenTest {
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println ("Enter a number:");
			int number = sc.nextInt();
			sc.close();
			
			if (number%2!=0 || (number%2==0 && (number>=6 && number<=20))) {
				System.out.println("Number is weird");
				}
				else {
				System.out.println("Number is not weird");
				}
			}	
		}	