import java.net.*;
import java.io.*;

public class server{
	public static void main(String[] args){
		while(true){
			try{
				ServerSocket s = new ServerSocket(9999);	
				Socket ss = s.accept();
				DataInputStream dis = new DataInputStream(ss.getInputStream());
				DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
				while(true){
					int cmd = dis.readInt();
					switch(cmd){
					case 1:
						dos.writeUTF("Hello world!");
						break;
					case 2:
						dos.writeUTF("Hello world !!!");
						break;
					}
					dos.flush();
				}
			}catch(IOException e){}
		}
	}
}