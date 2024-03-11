class MethodOverride1
{
    public void greet()
    {
        System.out.println("Hi from MethodOveride1");
    }
}
class MethodOveride2 extends MethodOverride1
{
    public void greet()
    {
        System.out.println("Hi from MethodOverride2");
    }
}

class MethodOverride
{
    public static void main(String args[])
    {
        MethodOveride2 mo = new MethodOveride2();
        mo.greet();
    }    
}
