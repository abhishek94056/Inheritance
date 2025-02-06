
package Task1;
import java.util.Scanner;
public class Home {

	public static void main(String[] args) {
		// 1. Create Fruit class with some variables and methods. 
		//Create 2 sub class from Fruit as SeededFruit and SeedlessFruit. 
		//Create 1 object of SeededFruit and SeedlessFruit. 
		//Assign values and print them. 
		// Use Scanner class and getter and setter methods at appropriate places.
		Scanner s = new Scanner(System.in);
		
		SeededFruit a = new SeededFruit();
		a.setFruit1(s.nextLine());
		a.setFruita(s.nextLine());
		a.setFruitb(s.nextLine());
		
		SeedlessFruit b = new SeedlessFruit();
		b.setFruit2(s.nextLine());
		b.setFruitc(s.nextLine());
		b.setFruitd(s.nextLine());
		
		System.out.println("type of Fruit: "+a.getFruit1());
		System.out.println("First Fruit: "+a.getFruita());
		System.out.println("Second Fruit: "+a.getFruitb());
		System.out.println("type of Fruit: "+b.getFruit2());
		System.out.println("First Fruit: "+b.getFruitc());
		System.out.println("Second Fruit: "+b.getFruitd());

	}

}
