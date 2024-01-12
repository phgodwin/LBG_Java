package practice;

public class App {

	public static void main(String[] args) {

		byte byt = 15;
		short shor = 115;
		int i = 1_000_000_000;
		long l = 9_000_000_000_000L;

		float fl = 23.45F;
		double db = 56.78;

		boolean b = true;
		
		char a = 'p';
		char c = 'g';

		
		System.out.println(byt);
		System.out.println(shor);
		System.out.println(i);
		System.out.println(l);
		System.out.println(fl);
		System.out.println(db);
		System.out.println(b);
		System.out.println(a);
		
		String fn = "Paige";
		String ln = "Godwin";
		
		System.out.println(fn+' '+ln); 
		
//		fl= null;
//		byt = null;
//		gave a type mismatch/compilation problems, cannot convert from null to byte
		
		
		System.out.println(a+c);
//		gives 215?
		
//		int broken = 23.12;
//		System.out.println(broken);
//		gives error same as above cannot convert from double to int
	
		
		
	}
	
}
