package test;

public class Demo {
	static int a=19,c=0;
	{
		c++;
	System.out.println("inside  non static block");
	}

	static {
		  System.out.println("inside  static block");
	}
//	public Demo(){
//		 System.out.println("inside constructre");
//	}
}
