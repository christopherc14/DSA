import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        boolean isPrime=true;

        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n % i==0) // n is a multiple of i
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime == true)
        {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}
