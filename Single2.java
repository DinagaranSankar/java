package single2;

class payilagam
{
	
	payilagam(int java)
	{
		java=20;
		System.out.println(java);
	}
}
class student extends payilagam
{
	int j2ee=10;
	student()
	{
		super(20);
	System.out.println(j2ee);
	}
}

class Single2 {

	public static void main(String[] args) 
	{
		student call =new student();
	}

}
