public class BubbleSort {

    public static void Bubblesort(int num [])
    {
        for(int i=0; i< num.length; i++)
        {
            for(int j=0; j<num.length-i-1; j++)
            {
                if(num[j] > num[j+1])
                {
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num [j+1] = temp; 
                }

            }
        }
    }
    public static void main(String [] args)
    {
        int num [] = {4,6,1,3,7,54,23,41,65,99};
    }
}
