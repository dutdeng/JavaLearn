import java.io.* ;
import java.util.* ;

public class inputAndOutput{
	public static void ScannerTest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a String:");
		String s = sc.next();
		System.out.println("Input a int:");
		int n = sc.nextInt();
		System.out.println("Input a double:");
		double d = sc.nextDouble();
		System.out.println(s+':'+n+' '+d);
	}
	public static void BufferedReaderTest()
	{
		String c= "";
		int n = 0;
		double d = 0.0;
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Input a int:");
			c = in.readLine();
			n = Integer.parseInt(c);
			System.out.println(n);
			System.out.println("Input a double:");
			c = in.readLine();
			d = Double.parseDouble(c);
			System.out.println(d);
		}catch(IOException e){}
	}
	public static void main(String[] args){
		BufferedReaderTest();
		ScannerTest();
	}
}
