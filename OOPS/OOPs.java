public class OOPs {
    public static void main(String [] args)
{
    Pen p1 = new Pen(); // Constructor
    p1.setColor("Green");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    p1.color="Blue";
    System.out.println(p1.color);
}

static class Pen {
    //properties + functions
    String color;
    int tip;

    void setColor(String newColor)
    {
        color = newColor;
    }

    void setTip(int newTip)
    {
        tip= newTip;
    }
}
}
