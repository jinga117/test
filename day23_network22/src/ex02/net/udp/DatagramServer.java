package ex02.net.udp;

import java.net.*;
import java.io.*;

public class DatagramServer {
	private final static int PACKSIZE = 100;
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("using : DatagramServer port");
			return;
		}
		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(port);
			System.out.println("The server is ready~~~~~~~");
			
			for(;;) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress() + " " + dp.getPort() + " : " + new String(dp.getData()));
				ds.send(dp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
