public class interfaceTest{
	public static void main(String[] args){
		A a = new A();
		System.out.println(A.Max_Num);
		a.methodA();
		a.methodB();
		K k = new A();
		System.out.println(K.Max_Num);
		k.methodA();
		//k.methodB();
	}
}

interface K{
	int Max_Num = 1000;
	void methodA();
}

class A implements K{
	public void methodA(){
		System.out.println("A:"+Max_Num);
	}
	public void methodB()
	{
		System.out.println("B:"+Max_Num);
	}
}

