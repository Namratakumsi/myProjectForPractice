package Sample1;
 class Flipkart
		{
			private String search="product1";
			public String getsearch()
				{
					return search;
				}
				public void setsearch(String search)
				{
					this.search=search;
				}
		}
		public class Mainclass73
		{
		public static void main(String[] args)
					{
						Flipkart f1=new Flipkart();
						System.out.println(f1.getsearch());
						f1.setsearch("product2");
						System.out.println(f1.getsearch());
					}
			}

