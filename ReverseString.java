import java.util.*;

public class ReverseString {  
   public static void main(String[] args) {  
     System.out.println(reverseString());  
   }  
  
   public static String reverseString() { 
		String input;
		 Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      input = in.nextLine();
 
     char[] inputArr = input.toCharArray();  
     char[] tempArr = new char[input.length()];  
     int i=0;  
     int j=0;  
     for (char ch:inputArr){  
       if(Character.isAlphabetic(ch)){  
         tempArr[i] = ch;  
         i++;  
       }  
     }  
     i--;  
     while(j<i){  
       char temp = tempArr[i];  
       tempArr[i]= tempArr[j];  
       tempArr[j]=temp;  
       j++;  
       i--; 
     }  
     for(i=0,j=0;i<input.length();i++){  
       if(Character.isAlphabetic(inputArr[i])){  
         inputArr[i]= tempArr[j];
		j++;
       }  
     }  
     return new String(inputArr);  
   }  
 }  