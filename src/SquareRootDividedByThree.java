import java.util.Scanner;
public class SquareRootDividedByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int sum = 0;
		
		System.out.print("Enter Value A: ");
		a = input.nextInt();
		
		System.out.print("Enter Value B: ");
		b = input.nextInt();
		
	
			for(String s=""; a < b; a++){
				
				if (a % 3 == 0){
					System.out.print( s + "Skip" + a );				
				} 
				else {
					int sqr = a * a;
					System.out.print(s + sqr);
					sum = sum + sqr;
					if(sum > 200){
						break;
					}
				}
				s = ", ";
				
			}
				
			
		
	
			
			
		input.close();
		
	}

	}
