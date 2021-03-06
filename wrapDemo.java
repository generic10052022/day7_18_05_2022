//wrapper class demo

class Tester
{
	public static void main(String s[])
	{
		int x=10;
		Integer y=new Integer(15);

		System.out.println("int value x = "+x);
		System.out.println("integer object Y = "+y);

		Integer z=y;
		System.out.println(" y == z  "+(y==z));
		System.out.println(" y equals z  "+(y.equals(z)));
		System.out.println(" y hashcode z  "+(y.hashCode()==z.hashCode()));

		System.out.println("\n*** wrapping and unwrapping ***\n");
		Integer a=new Integer(x);
		int b=Integer.valueOf(y);
		System.out.println("Integer object a = "+a);
		System.out.println("int value b = "+b);

		System.out.println("\n*** instanceof operator ***\n");
		System.out.println("check if a is Integer object  "+(a instanceof Integer)); 

System.out.println("\n*** converting numeric-string to number ***\n");
		String st="123";
		int p=Integer.parseInt(st);
		Integer q=new Integer(p);
		//Integer r=new Integer(Integer.parseInt(st));
		System.out.println("numeric string = "+st);
		System.out.println("int value p = "+p);
		System.out.println("Integer object q = "+q);

	System.out.println("\n*** type casting not supported by wrapper classes   ***\n");
		System.out.println("\n*** datatype conversion   ***\n");
		Integer i1=98765434;
		Long l1=4567899866L;

		Long l2=i1.longValue();
		Integer i2=l1.intValue();
		System.out.println("Integer object value i1 "+i1);
		System.out.println("Long object value l1 "+l1);
		System.out.println("Integer to Long object "+l2);
		System.out.println("Long to Integer object  "+i2);*/

System.out.println("\n** conversion of Integer object to string & binary-string  **\n");
		String str1=Integer.toString(5);
		String str2=Integer.toBinaryString(5);
		System.out.println("Integer object as  string: "+str1);
		System.out.println("Integer object as binary-string: "+str2);

	
	}
}
