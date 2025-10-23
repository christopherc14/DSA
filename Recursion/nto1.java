package Recursion;

//Print N to ! Decreasing Order
public class nto1 {
    public static void printDec(int n)
    {
        //Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
// Print n to 1 Increasing Order

    public static void printInc(int n)
    {
        if(n==1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " "); 
    }

    public static void main(String [] args){
        int n=10;
        
        printDec(n);
        printInc(n);
    }
}

