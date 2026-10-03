package practise;

public class p1 {
	static int add(int x, int y) {
		return x + y;
	}
    static int sub(int x, int y) {
		return x-y;
	}
    static int sq(int x) {
    	return x*x;
    }
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int x = sq(2);
		
		System.out.println(add (a,b));
		System.out.println(sub(b,a));
		System.out.println(sq(x));
	}
}
