import java.util.* ;

public class RotateArray {

    public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++){

                arr[i] = sc.nextInt();

            }

            int k = sc.nextInt();

 

            for(int i = 0; i < k; i++){

                int temp = arr[0];

                for(int j = 1; j < n; j++){

                    arr[j-1] = arr[j];

                }

                arr[n-1] = temp;

            }

            for(int i = 0; i < n; i++){

                System.out.print(arr[i] + " ");

            }
        }

    }

}
