class Vehicle
{
    int tyres;
    int MinNoOfPassengers;
    public void printClass()
    {
        System.out.println("From Vehicle class");
    }
}
class TwoWheeler extends Vehicle
{
    TwoWheeler()
    {
        tyres=2;
        MinNoOfPassengers=1;
    }
    public void showDetails()
    {
        System.out.println("No. of tyres: "+tyres+" Min No. of passengers: "+MinNoOfPassengers);
    }
}

class SingleInheritance
{
    public static void main(String args[])
    {
        TwoWheeler tw=new TwoWheeler();
        tw.printClass();
        tw.showDetails();
    }
}
