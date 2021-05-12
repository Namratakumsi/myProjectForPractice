
package Sample1;
	 class SBI
			{
				private int atmpin=8972;
				public int getatmpin()
					{
						return atmpin;
					}
					public void setatmpin(int atmpin)
					{
						this.atmpin=atmpin;
					}
			}
			public class Mainclass74
			{
			public static void main(String[] args)
						{
							SBI s1=new SBI();
							System.out.println(s1.getatmpin());
							s1.setatmpin(8762);
							System.out.println(s1.getatmpin());
						}
				}
