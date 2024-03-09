class ThisKeyword1
{
    int id;
    private String name;
    private int age;
    ThisKeyword1()
    {
        System.out.println("From default constructor");
    }
    ThisKeyword1(int id,String name,int age)
    {
        this();
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return this.age;
    }
    public String getName()
    {
        return this.name;
    }
}


class ThisKeyword
{
    public static void main(String args[])
    {
        ThisKeyword1 ts=new ThisKeyword1(1,"abcd",32);
        System.out.println("id:"+ts.id+"   name: "+ts.getName()+"    age:"+ts.getAge());
    }    
}
