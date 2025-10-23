package OOPS;

public class Encapsulation {
    public static void main(String [] args)
    {
        Student s1= new Student("Christopher");
        Student s2= new Student(402);
        System.out.println(s1.name);
        System.out.println(s2.usn);
        Student s3= new Student("AnanthaKumara", 400);
        System.out.println(s3.name + "\n"+ s3.usn);
    }
}

class Student {
    String name;
    int usn;

    Student(String name)
    {
        this.name = name; //Parameterised Constructor
    }

    Student(int usn)
    {
        this.usn=usn;
    }

    Student(String name, int usn)
    {
        this.name= name;
        this.usn = usn;
    }
}


// this is constructor overloading
