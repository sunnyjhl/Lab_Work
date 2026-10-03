package practise;

public class twoDArray {
	public static void main(String[] args) {
		int [][] m = {
				{11,22,33},
				{44,55,66},
				{77,88,99}
		};
		for(int i = 0; i < m.length; i++) {
			for(int j = 0;j< m[1].length;j++) {
				System.out.print(m[i][j] + " " );
			}
			System.out.println();
		}

	}
}
