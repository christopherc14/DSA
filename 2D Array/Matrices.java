import java.util.*;

public class Matrices
{
    public static void main(String [] args)
    {
        int matrix [] [] = new int [5][5]; // Creating 2D Array
        int n = 3, m=3;

        //Input 2D array from User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Elements of the array: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j]= sc.nextInt();
            }
        }

        //output
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}