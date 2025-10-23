// // // // // // // // // Hollow Rectangle
// // // // // // // // import java.util.*;

// // // // // // // // public class Patterns {

// // // // // // // //     public static void HollowRectangle(int tr, int tc)
// // // // // // // //     {
// // // // // // // //         for(int i=1; i<=tr; i++)
// // // // // // // //         {
// // // // // // // //             for(int j=1; j<=tc; j++)
// // // // // // // //             {
// // // // // // // //                 if(i==1 || i==tr ||j==1 || j==tc )
// // // // // // // //                 {
// // // // // // // //                     System.out.print("*");
// // // // // // // //                 }
// // // // // // // //                 else{
// // // // // // // //                     System.out.print(" ");
// // // // // // // //                 }
// // // // // // // //             }
// // // // // // // //             System.out.println();
// // // // // // // //         }
// // // // // // // //     }
// // // // // // // //     public static void main(String [] args)
// // // // // // // //     {
// // // // // // // //         Scanner sc= new Scanner(System.in);

// // // // // // // //         System.out.println("Enter the Number of Rows: ");
// // // // // // // //         int tr= sc.nextInt();
// // // // // // // //         System.out.println("Enter the Number of Colums:");
// // // // // // // //         int tc=sc.nextInt();

// // // // // // // //         HollowRectangle(tr, tc);
// // // // // // // //     }
// // // // // // // // }

// // // // // // // // Inverted Rotated Half Pyramid
// // // // // // // import java.util.*;
// // // // // // // public class Patterns{

// // // // // // //     public static void Inverted_Half_Pyramid(int n){

// // // // // // //         for(int i=1;i<=n; i++) // Rows
// // // // // // //         {
// // // // // // //             // For Spaces 
// // // // // // //             for(int j=1; j<=n-i; j++)
// // // // // // //             {
// // // // // // //                 System.out.print(" ");
// // // // // // //             }

// // // // // // //                 // For Stars
// // // // // // //             for(int j=1; j<=i; j++)
// // // // // // //             {
// // // // // // //                 System.out.print(j); // Here if it is j it will print Numbers.
// // // // // // //             }
// // // // // // //             System.out.println();
// // // // // // //         }
// // // // // // //     }
// // // // // // //     public static void main(String[] args){
// // // // // // //         Scanner sc=new Scanner(System.in);

// // // // // // //         int n=sc.nextInt();

// // // // // // //         Inverted_Half_Pyramid(n);

// // // // // // //     }
// // // // // // // }

// // // // // // // Inverted Half Pyramid
// // // // // // import java.util.*;
// // // // // // public class Patterns{

// // // // // //     public static void Inverted_Pyramid(int n){

// // // // // //         for(int i=1; i<=n; i++)
// // // // // //         {
// // // // // //             for(int j=1;j<=n-i+1;j++)
// // // // // //             {
// // // // // //                 System.out.print(j+" ");
// // // // // //             }
// // // // // //             System.out.println();
// // // // // //         }
// // // // // //     }
// // // // // //     public static void main(String[] args)
// // // // // //     {
// // // // // //         Scanner sc= new Scanner(System.in);
// // // // // //         int n=sc.nextInt();
        
// // // // // //         Inverted_Pyramid(n);
// // // // // //     }
// // // // // // }
// // // // // // Flyods Triangle 
// // // // // import java.util.*;
// // // // // public class Patterns{

// // // // //     public static void Flyods_Triangle(int n){
// // // // //         int counter=1;

// // // // //         for(int i=1;i<=n;i++)
// // // // //         {
// // // // //             for(int j=1;j<=i;j++)
// // // // //             {
// // // // //                 System.out.print(counter+" ");
// // // // //                 counter++;
// // // // //             }
// // // // //             System.out.println();
// // // // //         }
        
// // // // //     }
// // // // //     public static void main(String[] args){
// // // // //         Scanner sc= new Scanner(System.in);
// // // // //         int n= sc.nextInt();

// // // // //         Flyods_Triangle(n);

// // // // //     }
// // // // // }

// // // // // 0-1 Triangle 
// // // // import java.util.*;
// // // // public class Patterns{
// // // //     public static void Zero_one_Triangle(int n)
// // // //     {
// // // //         for(int i=1; i<=n;i++)
// // // //         {
// // // //             for(int j=1; j<=i; j++)
// // // //             {
// // // //                 if((i+j) % 2==0)
// // // //                 {
// // // //                     System.out.print("1 ");
// // // //                 }
// // // //                 else{
// // // //                     System.out.print("0 ");
// // // //                 }
// // // //             }
// // // //             System.out.println();
// // // //         }
// // // //     }
// // // //     public static void main(String[] args){
// // // //         Scanner sc= new Scanner (System.in);
// // // //         int n=sc.nextInt();
// // // //         Zero_one_Triangle(n);

// // // //     }
// // // // }

// // // //Butterfly Pattern
// // // import java.util.*;
// // // public class Patterns{

// // //     public static void Butterfly(int n){

// // //         //1st Half
// // //         for(int i=1;i<=n;i++)
// // //         {
// // //             //stars -i
// // //             for(int j=1; j<=i; j++)
// // //             {
// // //                 System.out.print("*");
// // //             }
// // //             //Spaces 2*(n-1)
// // //             for(int j=1; j<= 2*(n-i); j++ )
// // //             {
// // //                 System.out.print(" ");
// // //             }
// // //             //Stars
// // //             for(int j=1; j<=i; j++)
// // //             {
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //             //2nd Half

// // //             for(int i=n; i>=1;i--)
// // //             {
// // //                 //Stars
// // //                 for(int j=1;j<=i;j++)
// // //                 {
// // //                     System.out.print("*");
// // //                 }

// // //                 // Spaces 2*(n-i)
// // //                 for(int j=1; j<=2*(n-i); j++)
// // //                 {
// // //                     System.out.print(" ");
// // //                 }

// // //                 //Stars
// // //                 for(int j=1;j<=i;j++)
// // //                 {
// // //                     System.out.print("*");
// // //                 }
// // //                 System.out.println();
// // //             }
// // //     }
// // //     public static void main(String[] args)
// // //     {
// // //         Scanner sc=new Scanner(System.in);
// // //         int n=sc.nextInt();

// // //         Butterfly(n);

// // //     }
// // // }

// // // solid Rhombus
// // import java.util.*;
// // public class Patterns{

// //     public static void Solid_rhombus(int n){

// //         for(int i=1; i<=n; i++)
// //         {
// //             //Spaces
// //             for(int j=1; j<=n-i; j++)
// //             {
// //                 System.out.print(" ");
// //             }

// //             // Stars
// //             for(int j=1; j<=n; j++)
// //             {
// //                 System.out.print("*");
// //             }
// //             System.out.println();
// //         }
// //     }
// //     public static void main(String [] args){
// //         Scanner sc= new Scanner (System.in);
// //         int n= sc.nextInt();

// //         Solid_rhombus(n);

// //     }
// // }

// // Hallow Rhombus
// import java.util.*;
// public class Patterns{
//     public static void Hallow_Rhombus(int n)
//     {

//         for(int i=1;i<=n;i++)
//         {
//             //Spaces
//             for(int j=1;j<=n-i;j++)
//             {
//                 System.out.print(" ");
//             }

//             //Hallow Rectangle
//             for(int j=1; j<=n;j++)
//             {
//                 if(i==1 || i==n || j==1 || j==n)
//                 {
//                     System.out.print("*");
//                 }
//                 else
//                 {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();

//         }
//     }
//     public static void main(String [] args)
//     {
//         Scanner sc= new Scanner(System.in);
//         int n= sc.nextInt();
//         Hallow_Rhombus(n);
//     }
// }

// Diamond Pattern
import java.util.*;
public class Patterns{

    public static void Diamond(int n){
        // 1st Half
        for(int i=1; i<=n;i++)
        {
            // Spaces
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
                //Stars
            for(int j=1;j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd Half
        for(int i=n; i>=1;i--)
        {
            // Spaces
            for(int j=1; j<=n-i;j++)
            {
                System.out.print(" ");
            }
                //Stars
            for(int j=1;j<=(2*i)-1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        Diamond(n);

    }
}