Q. What is Inheritance?
A. The data of parent class is provided to child class.

Q. When to use it?
A. When we need to create sub-categories.

Q. Why to use it?
A. To reduce LOC

The very important keyword in inheritance is extends.
The child class always extends parent class.
The child class has 2 types of data.
1. data from the parent
2. its own data
The parent class never gets access to child's data.
The siblings never get access to each other's data.
We can write only one class name in front of extends keyword.

Types of Inheritance:
1. Single/Simple: Vehicle -> Car
2. Multi-level: A -> B -> C -> D -> ....
3. Multiple: (A, B, C, D) -> E
4. Hierarchy: A -> (B, C, D, E)
5. Hybrid: Combination of any of above types

example ->

<Vehicle.java>
public class Vehicle {
		
	public String company;
	
}

<Car.java>
public class Car extends Vehicle {
	
	public String color;
	
}

<Home.java>
public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		v.company="";
		
		Car c = new Car();
		c.color="";
		
	}
}
