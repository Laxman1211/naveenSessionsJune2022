package javasessions;

public class ArithmeticConcepts {

	public static void main(String[] args) {

		System.out.println(10/2); // 5 
		System.out.println(9/2); // 4 
		System.out.println(9/2.0); // 4.5 
		System.out.println(9.0/2); // 4.5 
		System.out.println(8/3); // 2  //
		System.out.println(9.0/2.0); // 4.5  
		
		// System.out.println(8/0);  // ArithmeticException: / by zero
		
		System.out.println(8.0/0); // Infinity 
 		System.out.println(0/9); // 0 
		System.out.println(9/0.0); // Infinity 
		
		//System.out.println(0/0); // Arithmetic Excep... 
		
		System.out.println(0.0/0); // NaN 
		System.out.println(0.0/0.0); // NaN 
		System.out.println(0/0.0); // NaN 
		
		System.out.println(9/9); // 1  
		System.out.println(50.2/0); //  Infinity 
		
		System.out.println(9%3); //0  
		System.out.println(9%2); // 1
		System.out.println(11%2); // 1
		System.out.println(17%3); // 2 
		
		System.out.println(100/2 +"Hello"); // 50Hello 
		String s = "hello";
		String s1 = "World";
		System.out.println(s+" "+s1);
		
		
	}
}
