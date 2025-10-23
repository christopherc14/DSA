package Recursion;

public class powerofn {
    public static int power(int x, int n){

        if(n==0){
            return 1;
        }
        int xm1= power(x, n-1);
        int xm= x * xm1;  
        return xm;
    }
    public static void main(String [] args) {
        int x=5;
        int n= 2;
        System.out.println(power(x, n));
    }  
}
