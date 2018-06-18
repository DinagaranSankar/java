package single1;
 class cycle {
 int speed=50;
 void tiar()
 {
	 System.out.println(speed);
 }
 cycle(int number)
 {
	 speed=350;
 }

 }
 class bike extends cycle{
	 int speed=150;
	 void bell()
	 {
		 System.out.println(speed);
	 }
	 }

  class Single1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       bike v=new bike ();// parent  class not support object child method access panna mudiyathu
       v.tiar();
       v.bell();

	}

}
