
// final method demo (final method cannot be overridden)

class DemoParent
{
	private int x;
	
	public DemoParent(){x=10;}
	public int getX(){return x;}
	public void setX(int x){this.x=x;}
	
	public void displayX()
	{
		System.out.println(" x= "+x);
	}
	final public void displayMsg()
	{
		System.out.println("Welcome message in parent method");
	}

}
class DemoChild extends DemoParent
{
	private int y;
	public DemoChild(){y=20;}
	public int getY(){return y;}
	public void setY(int y){this.y=y;}
	public void displayXY()
	{
		System.out.println(" x= "+getX());
		System.out.println(" y = "+y);
	}
	//public void displayMsg()
	public void displayMsgC()
	{
		System.out.println("Hello message in child method");
	}
}

class Tester
{
	public static void main(String s[])
	{
		DemoChild dc=new DemoChild();
		dc.displayX();
		dc.displayXY();
		dc.displayMsg();
		dc.displayMsgC();
	}
}


