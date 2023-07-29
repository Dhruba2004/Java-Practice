import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            int fact =1;
            int i;
            if (n==0){
            	fact=1;
            }else if (n<0){
            	System.out.println("Error");
            	System.exit(0);
            }
            for (i=1;i<=n;i++){
            	fact = fact*i;
            }
            System.out.println(fact);
        }
		
	}
}
