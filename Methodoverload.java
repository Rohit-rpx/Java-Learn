class Addition
{
    public int add(int n,int m)
    {
        return n+m;
    }
    public int add(int n,int m,int p)
    {
        return n+m+p;
    }
    public String add(String s1,String s2)
    {
        return s1+s2;
    }
}

class Methodoverload
{
    public static void main(String args[])
    {
        Addition a=new Addition();
        System.out.println("adding two  numbers: "+a.add(34,45));
        System.out.println("adding three numbers: "+a.add(56,67,78));
        System.out.println("adding two strings: "+a.add("hi ","hello"));
    }    
}
