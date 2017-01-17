	
	public class PrintTables {
		
		public static void main(String[] args) {
			int i = 1;
			
			for (i=0;i<=3;i++) {
				System.out.println("Table of " + i + " is:");
				int counter = 1 ;
				for (counter = 1; counter<=10;counter++) {
					System.out.println(i + " * " + counter + " = " + counter * i);
					}
				System.out.println();
				}
			}
		}	