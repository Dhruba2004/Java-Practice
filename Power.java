import java.util.Scanner;

public class Power {
	
	public static void main(String args[]) {
		
		try (Scanner sc = new Scanner (System.in)) {
			int num = sc.nextInt();
			int power= sc.nextInt();
			int sum=1;
			while(power>0){
				sum*=num;
				power--;
			}
			System.out.println(sum);
		}
		
	}
}

