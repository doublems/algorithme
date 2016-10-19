package Recursion;

/**
 * Created by jerry on 2016-10-19.
 */
public class FactorialByJay implements Factorial {
    @Override
    public int run(int n) {
        if(n==1){
            return n;
        }else{
            return n * run(n-1);
        }
    }

    @Override
    public double run(double n) {
        if(n==1.0){
            return n;
        }else{
            return n * run(n-1.0);
        }
    }
}
