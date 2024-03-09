class SuperKeyword1
{
    int age;
    SuperKeyword1()
    {
        System.out.println("From Super class");
    }
    SuperKeyword1(int age)
    {
        this();
        this.age=age;
    }
}
class SuperKeyword2 extends SuperKeyword1
{
    int age;
    SuperKeyword2()
    {
        System.out.println("From sub class");
    }
    SuperKeyword2(int age)
    {
        super(age-10);
        this.age=age;
        System.out.println("age(subclass): "+age+"   age(super class): "+super.age);
    }
}

class SuperKeyword
{
    public static void main(String args[])
    {
        SuperKeyword2 sk=new SuperKeyword2(20);
    }      
}
