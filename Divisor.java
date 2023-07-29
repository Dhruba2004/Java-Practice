import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Divisor{
    public static List< Integer > printDivisors(int n) {
        List<Integer>ll = new ArrayList<Integer>();
        for ( int i=1;i*i<=n;i++){
            if(n%i==0){
                ll.add(i);
                if((n/i)!=i){
                    ll.add(n/i);
                }
            }
        }
        Collections.sort(ll);
        return ll;
    }
}
