package Sample1;
class Whatsapp
	{
		private int otp=7829;
		public int getotp()
			{
				return otp;
			}
			public void setotp(int otp)
			{
				this.otp=otp;
			}
	}
	public class Mainclass71
	{
	public static void main(String[] args)
				{
					Whatsapp w1=new Whatsapp();
					System.out.println(w1.getotp());
					w1.setotp(7890);
					System.out.println(w1.getotp());
				}
		}
