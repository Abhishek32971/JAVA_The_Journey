class College
{
	public void display()
	{
        System.out.println("REVA");
	}
}
public class Anonymous
{
	public static void main(String args[])
	{
		College c=new College()
		{
			public void display()
			{
				System.out.println("REVA University");
			}
		};
		c.display();
}
}
