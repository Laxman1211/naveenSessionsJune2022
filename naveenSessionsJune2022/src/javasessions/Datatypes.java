package javasessions;

/**
 * 
 * @author Laxman
 *
 */
public class Datatypes {

	public static void main(String[] args) { 
		
	//byte:  1 byte, -128 to 127 
		byte b = 1; 
		b = 10; 
		System.out.println(b); 
		System.out.println("===================="); 
		
	//short:  // size - 2 bytes 
		short s = 10; 
		s = 200; 
		System.out.println(s);
		System.out.println("===================="); 
		
	//int: 	// size - 4 bytes 
		int i = 10;
		i =1000;
		System.out.println(i);
		System.out.println("===================="); 
				
	//Long:  // size - 8 bytes 
		long l = 122l; 
		l = -11212; 
		System.out.println(l); 
		System.out.println("===================="); 
				
	// Float  -- can store up to 6 decimal digits 
	// size - 4 bytes 
		float f = 12.45232323232332f;
		float f1 = (float) 34.5;
		System.out.println(f);
		System.out.println(f1);
		System.out.println("===================="); 
		
	// Double 	-- can store up to 15 decimal digits 
	// size - 8 bytes 
		double d = 12.4523232323233232332323232323232321313313123213131313123131233323232d; 
		double d1 = (double) 78.0923232323233232332323d;
		System.out.println(d);
		System.out.println(d1);
		System.out.println("===================="); 
		
	// char -- can store single character digit
	// size - 2 bytes 
	// range: 
	// a-z: 97 - 122 
	// A-Z: 65 - 90	
	// 1-9: 48 - 57	
	
	char c = 'a';	
	char c1 = 'b';	
	char c2 = '$';	
	char c3 = '5';	
	System.out.println(c);
	System.out.println(c2);
	System.out.println(c+c1);
	System.out.println(c2-c1);
	System.out.println(c3*c1);
	System.out.println('k');
	char t = '4';
	char t1 = '0';
	System.out.println(t+t1);
	System.out.println(t1);
	
	System.out.println((byte)c);
	System.out.println((int)'k');
	System.out.println("===================="); 
	
	char gender = 'm';
	char currency = '$';
	// boolean 
	
	boolean bo = true;
	boolean bo1 = false;
	System.out.println(bo);
	
	boolean flag = true;
	System.out.println(flag);

	
	}
	
}
