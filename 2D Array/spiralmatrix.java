// public class spiralmatrix{

//     public static void printSpiral(int mat[][])
//     {
//         int startRow = 0;
//         int startCol= 0;
//         int endRow= mat.length-1;
//         int endCol= mat[0].length-1;

//         while(startRow<=endRow && startCol <= endCol)
//         {
//             //top 

//             for(int j=startCol; j<=endCol;j++)
//             {
//                 System.out.print(mat[startRow][j]+" ");
//             }

//             //Right

//             for(int i= startRow+1; i<=endRow; i++)
//             {
//                 System.out.print(mat[i][endCol]+" ");
//             }

//             //Bottom
//             for(int j=endCol-1; j>=startCol; j--)
//             {
//                 if(startRow==endRow)
//                 {
//                     break;
//                 }
//                 System.out.print(mat[endRow][j]+" ");
//             }

//             //Left
//             for(int i= endRow-1; i>=startRow+1;i--)
//             {
//                 if(startCol==endCol)
//                 {
//                     break;
//                 }
//                 System.out.print(mat[i][startCol]+" ");
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }
//     public static void main(String [] args)
//     {
//         int mat[][]= {
//             {1,5,3,4},
//             {4,7,8,9},
//             {45,32,1,9},
//             {74,5,8,7}
//         };

//         printSpiral(mat);
//     }
// }

import java.util.*;
public class spiralmatrix{

    public static void printSprial(int mat[][])
    {
        int startRow=0;
        int startCol= 0;
        int endRow= mat.length-1;
        int endCol= mat[0].length-1;


        while(startRow <= endRow && startCol <= endCol)
        {
            //Top
            for(int j=startCol; j<= endCol; j++)
            {
                System.out.print(mat[startRow][j]+" ");
            }

            //Right
            for(int i=startRow+1; i<=endRow; i++)
            {
                System.out.print(mat[i][endCol]+" ");
            }

            //Bottom
            for(int j=endCol-1; j>=startCol; j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(mat[endRow][j]+" ");
            }

            //Left
            for(int i=endRow-1; i>=startRow+1; i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(mat[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
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

        printSprial(mat);

    }
}
