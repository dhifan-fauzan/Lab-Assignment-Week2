import java.util.Scanner;

public class Question3 {

	public static void main(String[] args){
		
		int height;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter The Height of the triangle: ");
		height = in.nextInt();
		
		for(int i = 1; i <= height; i++) {
			
			for( int k = i; k < height; k++) {
				System.out.print("x");
			
			}
			
			for(int j = 1; j <= i; j++ ) {
				
				System.out.print("*");
				
			}
			
			for(int m = 2; m <= i; m++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		
		in.close();
	}
	
}