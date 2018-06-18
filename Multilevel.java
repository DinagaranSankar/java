package multilevel;

class shape
{
	int size=50;
	void display()
	{
		System.out.println(size);
	}
}
class rectangle extends shape
{
	int area=550;
	void length()
	{
		System.out.println(area);
	}
}
class square extends rectangle
{
	int area=120;
	void radius()
	{
		System.out.println(area);
	}
}
class Multilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square mp=new square();
		mp.display();
		mp.length();
		mp.radius();

	}

}
