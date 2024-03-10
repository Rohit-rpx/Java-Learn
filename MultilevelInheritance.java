class Bike extends TwoWheeler
{
    int MaxNoOfPassengers=2;
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Max No of Passengers: "+MaxNoOfPassengers);
    }
}

class MultilevelInheritance
{
    public static void main(String args[])
    {
        Bike b1=new Bike();
        b1.printClass();
        b1.showDetails();
    }
}
