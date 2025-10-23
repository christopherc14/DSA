package Bit_manipulation;

public class clearithbit {
    
    public static int clearIthBit(int n, int i)
    {
        int BitMask= ~(i<<i);

        return n & BitMask;
    }
    public static void main(String args[])
    {
        System.out.println(clearIthBit(10, 1));
    }
}
