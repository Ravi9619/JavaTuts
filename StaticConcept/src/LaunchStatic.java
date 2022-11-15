class Demo
{
	//Static variables
	static int a;
	static int b;
	
	//static block
	static 
	{
		System.out.println("Static block");
		a=10;
		b=20;
	
	}
	//static method
	static void disp()
	{
		System.out.println("Static method");
		System.out.println(a);
		System.out.println(b);
	}
	//Class or Instance Variable
	int x;
	int y;
	
	//Non-static or Java Block
	{
		x=10;
		y=20;
		System.out.println("Non static Java blick");
	}
	
	//Constructor
	Demo()
	{
		System.out.println("Constructor");
	}
	//Non-static method
	void disp1()
	{
		System.out.println("Non static method");
		System.out.println(x);
		System.out.println(y);
		
	}
	//Non-static method
	void disp2()
	{
		disp1();
	}
}

public class LaunchStatic 
{
	public static void main(String[] args) {
	

		Demo d=new Demo();
		d.disp();
		d.disp1();
		Demo.disp();

		
	}
}
