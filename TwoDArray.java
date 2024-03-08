class TwoDArray 
{
    public static void main(String args[])
    {
        int ar[][]=new int[3][2];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
                ar[i][j]=(int)(Math.random()*100);
            }
        }
        for(int a[]:ar)
        {
            for(int b:a)
            {
                System.out.print(b+"\t");
            }
            System.out.println();
        }
    }    
}
