
class M {

	public void parentValidate() {
		System.out.println("Hi from parent");
	}

	}
	
	class Methods extends M {

		
		public void Validate() {
			
			System.out.println("Hi from Method");
		}
		
	}
	
public class M{
	
	public static void main(String[] args)
	{
		Methods m = new Methods();
	}


}
