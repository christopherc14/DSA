package Bit_manipulation;

public class oddeven {
   public static void oddEven(int n)
   {
        int bitMask =1;

        if((n&bitMask)==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
   } 
    public static void main (String[] args)
    {
        oddEven(8);
        oddEven(5);
        oddEven(4);
    }
}
