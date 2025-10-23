package OOPS;

public class Polymorphism {
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(5, 8));
        System.out.println(calc.sum((float)1.5,(float)2.9));
        System.out.println(calc.sum(7,8,9));
        Deer d = new Deer();
        d.eat();
    }
}

//Method Overloading 
//Multiple function with same name but different parameters

class Calculator{
    int sum(int a, int b)
    {
        return a+b;
    }

    float sum(float a , float b){
        return a + b;
    }

    int sum(int a , int b, int c){
        return a + b + c;
    }
}

//Method Overriding 
//parent and child class contain both same function with different definition
class Animal {
    void eat(){
        System.out.println("Eats Anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats Grass");
    }
}