package Recursion;

public class getfib {

    public static int Fib(int n){
        if(n==0 || n==1)
        {
            return n;
        }

        int fibn1= Fib(n-1);
        int fibn2= Fib(n-2);

        int fibn= fibn1 + fibn2;

        return fibn;
    }
    public static void main (String [] args)
    {
        int n= 25;
        System.out.println(Fib(n));
    }
}
