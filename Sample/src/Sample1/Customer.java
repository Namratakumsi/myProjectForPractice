package Sample1;

class ICICI
{
	private int atmpin=1234;
	public int getatmpin()
	{
	return atmpin;	
	}
	public void setatmpin(int atmpin)
	{
		this.atmpin=atmpin;
	}
}
class Customer
{
	public static void main(String[] args)
	{
		ICICI a1=new ICICI();
		System.out.println(a1.getatmpin());
		a1.setatmpin(2671);
		System.out.println(a1.getatmpin());
	}
}

