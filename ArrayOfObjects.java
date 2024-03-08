class Student
{
    String name;
    int roll;
    Student(){}
    Student(String n,int r)
    {
        name=n;
        roll=r;
    }
    public void show()
    {
        System.out.println("Name: "+name+"  roll: "+roll);
    }
}
class ArrayOfObjects
{
    public static void main(String args[])
    {
        Student s[]=new Student[3];
        s[0]=new Student("abcd",1);
        s[1]=new Student("efgh",7);
        s[2]=new Student();
        for(Student st:s)
        {
            st.show();
        }

    }    
}
