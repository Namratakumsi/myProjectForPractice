package Sample1;
	class Dunzo
		{
			private String search="product";
			public String getsearch()
				{
					return search;
				}
				public void setsearch(String search)
				{
					this.search=search;
				}
		}
		public class Mainclass72
		{
		public static void main(String[] args)
					{
						Dunzo d1=new Dunzo();
						System.out.println(d1.getsearch());
						d1.setsearch("product1");
						System.out.println(d1.getsearch());
					}
			}

