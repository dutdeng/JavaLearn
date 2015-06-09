public class paraTran{
	int data;
	public static void swap1(paraTran mj1, paraTran mj2){
		paraTran temp = mj1;
		mj1 = mj2;
		mj2 = temp;
	}
	public static void swap2(paraTran mj1, paraTran mj2){
		int temp = mj1.data;
		mj1.data = mj2.data;
		mj2.data = temp;
	}
	public static void main(String[] args){
		paraTran mj1 = new paraTran();
		mj1.data = 5;
		paraTran mj2 = new paraTran();
		mj2.data = 3;
		swap1(mj1, mj2);
		System.out.println(mj1.data+" "+mj2.data);
		swap2(mj1, mj2);
		System.out.println(mj1.data+" "+mj2.data);
	}
}
