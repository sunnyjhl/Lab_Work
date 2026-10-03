package practise;

public class overloading {
	//Overloading
	static int add(int x, int y) {
		return x+y;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 5;
		
		System.out.println(add(b,c));
		System.out.println(add(a,b,c));
	}

}
