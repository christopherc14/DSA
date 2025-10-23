// // // // // 

// // // // import java.util.*;
// // // // public class functions{

// // // //     public static void calculateSum(int num1, int num2)
// // // //     {
// // // //         int sum= num1+num2;
// // // //         System.out.println("The Sum of two Numbers is:"+ sum);
// // // //     }
// // // //     public static void main(String args[]){
// // // //         Scanner sc= new Scanner(System.in);

// // // //         int a=sc.nextInt();
// // // //         int b=sc.nextInt();

// // // //         calculateSum(a,b);
// // // //     }   
// // // // }

// // // Functions to Multiply two Numbers

// // // import java.util.*;
// // // public class functions{

// // //     public static int prod(int a, int b){
// // //         int product = a * b;
// // //         return product;
// // //     }
// // //     public static void main(String[] args){
// // //         Scanner sc=new Scanner(System.in);

// // //         int a=sc.nextInt();
// // //         int b=sc.nextInt();

// // //         int product= prod(a,b);
// // //         System.out.println("The Product of Two Numbers are:"+ product);

// // //         product= prod(10,20);
// // //         System.out.println("Product of Numbers 10 and 20 :" + product);
// // //     }
// // // }


// // // Function to find factorial of a number
// // import java.util.*;
// // public class functions{

// //     public static int Factorial(int n){

// //         int fact=1;

// //         for(int i=1; i<=n; i++)
// //         {
// //             fact*=i; // Formula to find Factorial of a number
// //         }

// //         return fact;
// //     }

// //     public static int binCoeff(int n, int r){
// //         int fact_n= Factorial(n);
// //         int fact_r= Factorial(r);
// //         int fact_nmr= Factorial(n-r);

// //         int binCoeff=  fact_n / ( fact_r * fact_nmr);
// //         return binCoeff;
// //     }
// //     public static void main(String [] args)
// //     {
// //         Scanner sc = new Scanner(System.in);

// //         int n=sc.nextInt();
// //         int r=sc.nextInt();

// //         System.out.println(binCoeff(n, r));

// //         // System.out.println("Enter a Number to find its Factorial");
// //         // int n=sc.nextInt();

// //         // int fact= Factorial(n);
// //         // System.out.println("The Factorial of a Number is :" +fact);
// //     }
// // }

// // import java.util.*;
// // public class functions{
    

// // public static boolean isPrime(int n){
    
// //     boolean isPrime=true;
// //     for(int i=2; i<=n-1; i++)
// //     {
// //         if(n%i==0)
// //         {
// //             isPrime=false;
// //             break;
// //         }
// //     }

// //     return isPrime;
// // }
// //     public static void main(String[] args){

// //         Scanner sc=new Scanner(System.in);

// //         int n=sc.nextInt();
// //         System.out.println(isPrime(n));
// //     }
// // }

// // Check whether a number is prime or not an optimized way 

// import java.util.*;
// public class functions{

//     public static boolean isPrime(int n){
//         boolean isPrime = true;

//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n%i==0)
//             {
//                 isPrime= false;
//                 break;
//             }
            
//         }

//         return isPrime;
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a Number n: ");
//         int n=sc.nextInt();

//         System.out.println("The output is: true if it is prime , False if it is not:\n"+ isPrime(n));
//     }
// }

// Primes in Range
import java.util.*;

public class functions {

    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }

    public static void PrimeRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // Print primes in one line
            }
        }
        System.out.println(); // New line after printing all primes
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        PrimeRange(n);
        sc.close(); // Close the scanner to avoid resource leak
    }
}