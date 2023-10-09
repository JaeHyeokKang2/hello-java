package gugudan;

public class Gugudan {
	public static int[] calculate(int items) {
		int [] gugu = new int[9];
		for (int i = 0; i<9; i++) {
		gugu[i] = items * (i+1);
		
		}
		return gugu;
	}
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			int [] result = calculate(i);
			print(result);
		
		}
			
		}
	}

