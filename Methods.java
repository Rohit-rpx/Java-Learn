class Student2
{
    String name="abcd";
    int id=545,marks;
    public void setmarks(int m)
    {
        marks=m;
    }
    public double avg()
    {
        return (double)marks/4;
    }
}

class Methods
{
    public static void main(String args[])
    {
        Student2 s1=new Student2();
        s1.setmarks(98);
        System.out.println("Average is: "+s1.avg());
    }    
}
