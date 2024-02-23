class Switch
{
    public static void main(String args[])
    {
        int ch=2;
        int a=5,b=7;
        switch(ch)
        {
            case 1:
                System.out.println("Addition : "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction : "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication : "+(a*b));
                break;
            case 4:
                System.out.println("Division : "+(a/b));
                break;
            default:
                System.out.println("Not a valid option");
        }
    }    
}
