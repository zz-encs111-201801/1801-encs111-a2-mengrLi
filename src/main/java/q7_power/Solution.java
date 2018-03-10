package q7_power;

 public class Solution {
    public int power(int base, int power)
   {

        int x = base;

        int n = power;


        return function(x, n);

    }
    public static int function (int x,int n){
        if(n > 0){
            return x*function(x, n - 1);
        }
        return 1;
    }
}
