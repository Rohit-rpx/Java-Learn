class JaggedArray {
    public static void main(String args[])
    {
        int ar[][] = new int[3][];
        ar[0] = new int[4];
        ar[1] = new int[2];
        ar[2] = new int[3];
        for (int a[] : ar)
        {
            for (int i = 0; i < a.length; i++)
            {
                a[i] = (int) (Math.random() * 10);
            }
        }
        for (int a[] : ar)
        {
            for (int i : a)
            {
                System.out.print(i + "  ");
            }
            System.out.println();
        }
    }
}
