package javasessions; 

public class StringReverse { 

	public static void main(String[] args) { 
		String str = "RGJQ 3DBCA";  //10 

		String reverse = " "; 

		for(int i = str.length()-1; i>=0; i--) { 
		reverse = reverse + str.charAt(i); 
		} 
		System.out.println("Reverse string ="+reverse); 

	} 
} 
