import java.io.*;
import java.net.*;

public class client{
	public static void main(String[] args) throws Exception{
		Socket ss = new Socket("127.0.0.1",9999);
		DataInputStream dis = new DataInputStream(ss.getInputStream());
		DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
		dos.writeInt(1);
		dos.flush();
		System.out.println(dis.readUTF());
		dos.writeInt(2);
		dos.flush();
		System.out.println(dis.readUTF());
		ss.close();
	}
}