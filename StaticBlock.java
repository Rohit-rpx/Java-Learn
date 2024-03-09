class StaticBlock1
{
    StaticBlock1()
    {
        System.out.println("In StaticBlock1 Constructor");
    }
    static
    {
        System.out.println("In Static Block");
    }
}

class StaticBlock
{
    public static void main(String args[]) 
    {
        StaticBlock1 sb=new StaticBlock1();
    }   
}
