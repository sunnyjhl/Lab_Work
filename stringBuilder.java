package practise;

public class stringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Hello ");
		sb.append("Jayaditya ");
		//append multple string ko jhodta hai
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(2));
		System.out.println(sb.reverse());	
	}
}
