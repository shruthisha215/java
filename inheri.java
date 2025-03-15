class Vehicle 
{
    String color;
    int year;
    Vehicle(String color, int year) 
    {
        this.color = color;
        this.year = year;
    }
    void displayColor() 
    {
        System.out.println("Color: " + color);
    }
    void displayYear() 
    {
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle 
{
    String brand;
    Car(String color, int year) 
    {
        super(color, year);
    } 
    void displayDetails()
    {
        displayColor();
        displayYear();  
    }
}

public class inheri
{
    public static void main(String args[]) 
    {
     Car myCar = new Car("Red", 1979);
        myCar.displayDetails();
    }
}
