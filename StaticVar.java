class StaticVar1
{
    static int n;
    static String name;
    static int age;
    public static void show()
    {
        System.out.println("n: "+n+"  name: "+name+"   age: "+age);
    }
}

class StaticVar
{
    public static void main(String args[])
    {
       StaticVar1.n=34;
       StaticVar1.name="abcd";
       StaticVar1.age=5;
       StaticVar1.show();
       System.out.println(StaticVar1.n);
    }    
}
