package turing.JavaSE.Day16Annotations;

public class DeprecatedDemo
{
    @Deprecated
    public void Display()
    {
        System.out.println("DeprecatedDemo display()");
    }

    public static void main(String args[])
    {
        DeprecatedDemo d = new DeprecatedDemo();
        d.Display();
    }
}

