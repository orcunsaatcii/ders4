import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> item = new ArrayList<String>();
		
		item.add("red");
		item.add("yellow");
		item.add(0,"green");
		
		for(String color : item) {
			System.out.print(color + " ");
		}
		item.remove("red");
		System.out.println();
		for(String color : item) {
			System.out.print(color + " ");
		}
		System.out.println();
		System.out.println(item.get(1));
		System.out.println(item.contains("yellow"));
		
		
		
		
		
		
		
	}
	
	
		
			
	
	

}
