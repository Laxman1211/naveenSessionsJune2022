package javasessions;

public class StringConcatination {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		
		String x = "Hello";
		String y = "World";
		
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println("Hello world Laxman "+a+b);
		System.out.println("Hello world Laxman "+(a+b));
		System.out.println("The value of a: "+a);
		System.out.println("The value of a: "+b);
		System.out.println("The sum is :"+a+b);
		
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		double d1 = 12.34;
		double d2 = 54.32;
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(x+y+d1+d2);
		System.out.println(x+c1);
		System.out.println(x+y+(c1+c2));
		
	}
}
