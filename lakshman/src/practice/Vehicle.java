package practice;

interface Vehicle 
{
    void getNoOfWheels();
}
class Car
{
    
    void getType(Vehicle v) 
    {
        v.getNoOfWheels();
    }
}
class BeautifulCars
{
    void getTheBeautifilCar()
    {
        Car c = new Car ();
        c.getType (new Vehicle ()
        {
            public void getNoOfWheels ()
            {
                System.out.println("It has four wheels");
            }
        });
    
    }
    
    public static void main(String[] args) 
    {
        BeautifulCars bObj = new BeautifulCars();
        bObj.getTheBeautifilCar();
    }
    
}

