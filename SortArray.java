import java.util.Scanner;

	public class SortArray {
		public static void main(String[] args) {
			int n, temp;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number of elements wanted in array");
			n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter all elements of array");
			for (int counter=0;counter<n;counter++) {
				a[counter] = sc.nextInt();
			}
			for (int i=0;i<n;i++) {
				for (int sortAlgo=i+1;sortAlgo<n;sortAlgo++) {
					if (a[i] > a[sortAlgo]) { 
						temp = a[i];
						a[i] = a[sortAlgo];
						a[sortAlgo] = temp;
						}
					}
				}	
			System.out.println("Ascending order is: ");
					for (int i = 0 ; i<n-1 ; i++) {
						System.out.print(a[i] + ",");
        }
						System.out.print(a[n - 1]);
					
			}
		}	