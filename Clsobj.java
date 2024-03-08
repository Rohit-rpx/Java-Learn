class Student1
{
    String name="abcd";
    int id=545,marks=99;
    public void display()
    {
        System.out.println("Name: "+name+"\nid: "+id+"\nmarks: "+marks);
    }
}

class Clsobj
{
    public static void main(String args[])
    {
        Student1 s1=new Student1();
        s1.display();   
    }
}
