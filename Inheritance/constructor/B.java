package constructor;

public class B extends A{
	
	public B()
	{
		super("gsufg");
		System.out.println("B-non-para");
	}
	public B(String f)
	{
		super();
		System.out.println("B-para1");
	}
	public B(int g)
	{
		super(7898);
		System.out.println("B-para2");
	}

}
