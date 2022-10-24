import java.util.Scanner;


public class Arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int []array = {32,27,64,18,95,14,90,70,60,37};
		
		for(int i: array) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=0,j=array.length-1; i<=4; i++,j--) {
			int temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		for(int i: array) {
			System.out.print(i + " ");
		}
		
		

	}

}
