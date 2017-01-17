import java.util.Scanner;


public class MealCost {
		
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("Enter the price of meal:");
		double mealCost = sc.nextDouble();
		System.out.println ("Enter the tip percent:");
		int tipPercent = sc.nextInt();
		System.out.println ("Enter the tax percent:");
		int taxPercent = sc.nextInt();
		double totalMealCost = mealCost + (mealCost * tipPercent/100) + (mealCost * taxPercent/100);
		System.out.println ("Total Cost of meal is " + totalMealCost);
		sc.close();
	}
}	
