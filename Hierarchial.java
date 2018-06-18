package hierarchial;
class Sachin
{
	int runs=18854;
	void littlemaster()
	{
		System.out.println(runs);
	}
}
class Dhoni extends Sachin
{
	int captain=3;
	void bestcaptain()
	{
		System.out.println(captain);
	}
}
class sehwag extends Sachin
{
	int highest=319;
	void dangerousplayer()
	{
		System.out.println(highest);
	}}
class dravid extends Sachin
{
	int coach=19;
	void bestcoach()
	{
		System.out.println(coach);
	}}
 class Hierarchial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dhoni obj1=new Dhoni();
		  obj1. littlemaster();
		sehwag obj2=new sehwag();
		obj2. littlemaster();
		dravid obj3=new dravid();
		obj3.littlemaster();
		 

	}

}
