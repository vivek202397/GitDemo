
public class subClass extends mainclass {
	
	
	public void Display()
	{
		System.out.println("In sub class method");
		super.Display();
		System.out.println(super.roll);
		
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subClass obj = new subClass();
		obj.Display();
		
		
		
	}
		
	}
