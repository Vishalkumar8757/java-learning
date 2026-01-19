 class Vehicle{
	public void start(){
		System.out.println("Vehicle starts");
	}

}
class Car extends Vehicle{
	public void drive(){
		System.out.println("Car is a Driving");
	}
}
class Bike extends Vehicle{
	public void ride(){
		System.out.println("Bike is a riding");
	}
}

	public static void main(String args[]){
	Vehicle v=new Vehicle();
	v.start();
	//v.drive();
	//v.ride();
	Car c=new Car();
	c.start();
	c.drive();
	//c.ride();
	Bike b=new Bike();
	b.start();
	b.ride();
	}

