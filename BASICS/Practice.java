class Practice{
	public static void main(String[] args)
	{
		System.out.println("my program");
		{
			int a=40;
			System.out.println(a);
		}
		int z=40;
		{
			int b = 20;
			int c=50;
			int x=30;
			{
				 x=60;
			}
			int a=20;
			System.out.println(x+z+c+b+a);
		}
	}
}
