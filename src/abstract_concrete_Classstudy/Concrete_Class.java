package abstract_concrete_Classstudy;

public class Concrete_Class extends Abstract_Class
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete_Class C = new Concrete_Class();
		C.test1();
		C.test2();
		C.test3();
	}

	@Override
	public void test1() 
	{
		System.out.println("test1 in Cc class");
		
	}

	@Override
	public void test2() 
	{
		System.out.println("test2 in Cc class");
		
	}

}
