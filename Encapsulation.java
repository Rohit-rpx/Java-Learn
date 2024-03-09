class Encapsule
{
    private int id;
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String str)
    {
        name=str;
    }
    public void setId(int i)
    {
        id=i;
    }
    public int getId()
    {
        return id;
    }

}

class Encapsulation
{
    public static void main(String args[])
    {
        Encapsule en=new Encapsule();
        en.setName("abcd");
        en.setId(3);
        System.out.println("name: "+en.getName()+"    id: "+en.getId());
    }    
}
