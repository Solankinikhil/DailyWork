package firstPackage;

public class M {

	private int age;
	private double salary;
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	

	


	 public static void main(String[] args)
	 {
		M ob=new M();
		ob.setAge(22);
		
		
		int a=ob.getAge();
		System.out.println(ob.getAge());
		
		
		
	 }
}

