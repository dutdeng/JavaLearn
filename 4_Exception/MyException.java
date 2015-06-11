import java.io.*;
public class MyException extends Exception{
	MyException(){}
	MyException(String message){
		super(message);
	}
	MyException(String message,Throwable cause){
		super(message,cause);
	}
	MyException(Throwable cause)
	{
		super(cause);
	}
	public static void main(String[] args){
		ReadFile rf = new ReadFile();
		try{
		rf.output();
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex.getCause());
		}
	}
}

class ReadFile{
	public void output() throws MyException
	{
		try{
			int a=5,b=0;
			int c=a/b;
		}
		catch(Exception ex)
		{
			throw new MyException("123",ex);
		}
	}
}
