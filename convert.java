import java.util.* ;

class Solution {

public static void main(String args[]) {

        try (Scanner sc = new Scanner(System.in)) {
            int S = sc.nextInt();

            int E =sc.nextInt();

            int W =sc.nextInt();

             

             int convert = 0;

 

                // conversion of f to c is (f-32)*5/9

 

                for(int i =S; i <=E;i+=W){ //0,20,40,60,80

 

                //0 -- -17

 

                    convert = (i-32)*5/9;

                    System.out.println(i+" "+convert);

 

                }
        }

        

        

    }

}
