class Switchreturn
{
    public static void main(String args[])
    {
        int ch=1;
        int result=switch(ch)
        {
            case 1->5+10;
            case 2->5-10;
            case 3->5*10;
            case 4->5/10;
            default->0;
        };
        System.out.println("Result: "+result);
    }    
}
