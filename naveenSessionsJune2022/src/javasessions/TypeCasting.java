package javasessions;
public class TypeCasting {
	public static void main(String[] args) {		
		// widening type 
		// conversion of lower data type to higher types.
		byte b = 5;
		short s = b;
		int i = b;
		long l = b;
		System.out.println(b);
		System.out.println(s);
		
		// Narrowing type 
		// conversion of higher data type to lower types.. 
		int p = 100; 
		short s1 = (short) p; 
		byte b1 = (byte) p; 
		System.out.println(s1); 
		System.out.println(b1); 
		
		byte m = 100; //10
		byte n = 110; //14
		//byte t = m+n; 
		byte t= (byte) (m+n); // -42 
		int t1 = m+n; 
		System.out.println(t); 
		System.out.println(t1); 
		
		// char c = '97'; 
		char c = 97; 
		System.out.println(c); 
		System.out.println(c+'b'); 
		
	} 
} 
