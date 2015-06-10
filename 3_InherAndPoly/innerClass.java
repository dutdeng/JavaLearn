public class innerClass{
	public static void main(String[] args){
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		Outer.Inner ii = new Outer().new Inner();
		
		Outer2 o2 = new Outer2();
		Outer2.Inner2 i2 = new Outer2.Inner2();
	}
}
class Outer{
	private int s = 111;
	class Inner{
		private int s = 222;
		public void output(int s){
			System.out.println(s);
			System.out.println(this.s);
			System.out.println(Outer.this.s);
		}
	}
}

class Outer2{
	static class Inner2{
		
	}
}

