class OneDArray
{
    public static void main(String args[])
    {
        int ar[]=new int[6];
        ar[0]=3;
        ar[1]=6;
        ar[2]=8;
        ar[3]=2;
        ar[4]=5;
        ar[5]=6;
        int ar1[]={23,34,45,56,67};
        System.out.println("Array ar elements:");
        for(int i:ar)
        {
            System.out.print(i+"\t");
        }
        System.out.println("\nArray ar1 elements:");
        for(int i:ar1)
        {
            System.out.print(i+"\t");
        }
    }
}
