public class Fibo{
	public int fibo1(int n){
		if (n == 0){
			return 0; 
		}
		else if (n == 1){
			return 1;
		}
		return fibo1(n-1) + fibo1(n-2);
	}
	public int fibo2(int n){
		int a1 = 1, a0 = 0, temp =0;
		if (n == 0){
			return 0; 
		}
		else if (n == 1){
			return 1;
		}
		else{
			for(int i =2; i <= n; i++)
			{
				temp = a1 + a0;
				a0 = a1;
				a1 = temp;
			}
			return temp;
		}
		
	}
	public static void main(String[] args){
		Fibo fb = new Fibo();
		System.out.println(fb.fibo1(10));
		System.out.println(fb.fibo2(10))
	}
}
