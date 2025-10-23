import java.util.Scanner;

public class diagonalsum {

    public static int Diagonalsum(int mat[][])
    {
        int sum= 0;
        //Primary Diagonal
        for(int i=0;i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
            {
                if(i==j){
                sum += mat[i][j];
                }
                else if(i+j==mat.length-1){
                    sum += mat[i][j];
                }
            }
        }

        return sum;
    }
 public static void main(String [] args)
 {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Matrix: ");
        int n = sc.nextInt();
        int m= sc.nextInt();
        int mat[][]= new int[n][m];

        System.out.println("Enter the Elements in the Matrix: ");
        for(int i=0; i<n;i++)
        {
            for(int j=0; j<m; j++)
            {
                mat[i][j]= sc.nextInt();
            }
        }

        // Display Elements

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

 }   
}
