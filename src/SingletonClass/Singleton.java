package SingletonClass;

public class Singleton {
	
	public static Singleton obj = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance()
	{
		if(obj == null)
		{
			obj = new Singleton();
		}
		
		return obj;
	}

}
