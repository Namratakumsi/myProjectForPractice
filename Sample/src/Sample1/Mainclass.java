package Sample1;
class Facebook
{
	private String pwd="dingi@123";
	public String getpwd()
		{
			return pwd;
		}
		public void setpwd(String pwd)
		{
			this.pwd=pwd;
		}
}
public class Mainclass
{
public static void main(String[] args)
			{
				Facebook f1=new Facebook();
				System.out.println(f1.getpwd());
				f1.setpwd("cool@123");
				System.out.println(f1.getpwd());
			}
	}
