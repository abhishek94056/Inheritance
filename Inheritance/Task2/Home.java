package Task2;
import java.util.Scanner;
public class Home {

	public static void main(String[] args) {
		// Create Animal class and create 2 child classes as Wild and Pet. 
		//All 3 classes must have some variables and methods. 
		//Create 1 object for lion & 1 object for cat. 
		//Assign values and print them. 
		//Use Scanner class and getter and setter methods at appropriate places.
		Scanner s = new Scanner(System.in);
		Wild c = new Wild();
		c.setB(s.nextLine());
		Pet d = new Pet();
		d.setA(s.nextLine());
		c.info();
		System.out.println(c.getB());
		System.out.println(d.getA());
		

		
		
		
	}

}
