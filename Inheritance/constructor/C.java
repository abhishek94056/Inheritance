package constructor;

public final class C extends B{     //use final keyword
	
	public String surname; 
	public C()
	{
		super(68);                   //use super keyword
		System.out.println("C-non-para");
	}
	
	public C(String h)
	{
		super();
		System.out.println("C-para1");
	}
	public C(int i)
	{
		super("vhhv");
		System.out.println("C-para2");
	}

}
