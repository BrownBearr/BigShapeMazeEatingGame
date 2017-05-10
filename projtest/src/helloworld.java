
public class helloworld {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("today is a good day");
		randomizer(6);
	}
	
	public static int randomizer(int n)
	{
		int p = (int)(1+Math.random()*n);
		return p;
	}
	

}
