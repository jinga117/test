package ex02.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramClient {
	
	private final static int PACKSIZE = 100;
	
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("using : DatagramServer host, port");
			return;
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]);
			int port = Integer.parseInt(args[1]);
			
			ds = new DatagramSocket();
			byte[] data = "test".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			ds.setSoTimeout(2000);
			dp.setData(new byte[PACKSIZE]);
			System.out.println(new String(dp.getData()));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if( ds != null) ds.close();
		}
		
	}
}
