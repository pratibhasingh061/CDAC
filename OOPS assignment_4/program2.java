package in.com;
import java.util.Scanner;
class Vehicle {
	String color;
	int speed;
	String area;
    public void drive() {
    	Scanner drive = new Scanner(System.in);
    System.out.print("Color : ");
    this.color = drive.nextLine();
    System.out.print("Speed : ");
    this.speed = drive.nextInt();
    System.out.print("Area : ");
    this.area = drive.nextLine();
    }
    
    
    public void drive(String color, String area, int speed) {
        System.out.println( "color"  + speed  + "area" );
    }
    
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); 
        vehicle.drive("red" , 80 , "City Center");
    }
}
