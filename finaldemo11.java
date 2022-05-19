
// final keyword used to declare  data memeber as constant( have to intitialize it at the time of declaration or in constructor only)
//final local variable (have to initialize at the time of declaration)

class Demo
{
	final private int x;
	private int y;
	public Demo(){x=10;y=20;}
	public int getX(){return x;}
	//public void setX(int x){this.x=x;}
	public int getY(){return y;}
	public void setY(int y){this.y=y;}
	public void displayXY()
	{
		System.out.println(" x = "+x);
		System.out.println(" y = "+y);
		//x=50;
		//System.out.println(" x = "+(x++));
		//System.out.println(" x= "+(x+5));
	}
}

class Tester
{
	public static void main(String s[])
	{
		//final int t;
		//t=10;
		final int t=50;
		System.out.println("t = "+t);
		//t=t+10;
		Demo d=new Demo();
		d.displayXY();
	}
}


