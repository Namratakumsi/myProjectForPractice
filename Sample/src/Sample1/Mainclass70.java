
package Sample1;
class Instagram
	{
		private String pwd="Nimmy*45";
		public String getpwd()
			{
				return pwd;
			}
			public void setpwd(String pwd)
			{
				this.pwd=pwd;
			}
	}
public class Mainclass70
	{
	public static void main(String[] args)
				{
					Instagram i1=new Instagram();
					System.out.println(i1.getpwd());
					i1.setpwd("nimmy1");
					System.out.println(i1.getpwd());
				}
		}

