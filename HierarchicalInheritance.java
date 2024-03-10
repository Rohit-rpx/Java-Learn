class FourWheeler extends Vehicle
{
    FourWheeler()
    {
        tyres=4;
        MinNoOfPassengers=2;
    }
    public void showDetails()
    {
        System.out.println("No. of tyres: "+tyres+" Min No. of passengers: "+MinNoOfPassengers);
    }
}

class HierarchicalInheritance
{
    public static void main(String args[])
    {
        FourWheeler fw=new FourWheeler();
        fw.showDetails();
        TwoWheeler tw=new TwoWheeler();
        tw.showDetails();
    }    
}
