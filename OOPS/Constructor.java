package OOPS;

public class Constructor {
    
    public static void main(String args[] )
    {
        Student s1 = new Student("Christopher", 1234);
        System.out.println("Name:" + s1.name + "\n" + "Roll no : " + s1.roll);
    }
}

class Student {
    String name; 
    int roll;

    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

}
