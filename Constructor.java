

class Constructor
{
    int id;
    int age;
    Constructor()
    {
        System.out.println("Object created");
    }
    Constructor(int i,int a)
    {
        id=a;
        age=a;
        System.out.println("Object craeted and initialized");
    }
    public void show()
    {
        System.out.println("id: "+id+"    age: "+age);
    }
    public static void main(String args[])
    {
        Constructor c1=new Constructor(3,15);
        c1.show();
    }      
}
