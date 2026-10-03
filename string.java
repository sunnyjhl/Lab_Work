package practise;

public class string {
	public static void main(String[] args) {
		String s = "Jayaditya";
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(1)); //values ko hatane ke liye 
		System.out.println(s.indent(15)); //gap dene ke liye 
		System.out.println(s.indexOf('y'));
		System.out.println(s.contains("ditya")); //ye aisa likha hai ki nahi ye check karnata hai 
        		
	}

}
