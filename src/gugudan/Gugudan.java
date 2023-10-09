package gugudan;
import java.util.Scanner;
public class Gugudan{
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);	
		String texts = src.nextLine();
		String[] val = texts.split(",");
		int first = Integer.parseInt(val[0]);
		int second = Integer.parseInt(val[1]);
		for (int i = 0; i < second; i++) {
			int[] res = new int[second];
			res[i] = first * (i+1);
			System.out.println(res[i]);
		}
 }

		
	
}