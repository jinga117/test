package ex02.net.udp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUdp {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		int port = 5000;
		String str;
		byte[] b;

		try {
			System.out.println("### File Client ###");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상( server ip ) = ");
			String ipAddress = br.readLine();
			System.out.println("전송 파일(파일명.확장자) = ");
			String fileName = br.readLine();

			File file = new File(fileName);

			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다. ");
				System.exit(-1);
			}
			ds = new DatagramSocket();
			InetAddress iaddress = InetAddress.getByName(ipAddress);
			str = "start";
			b = str.getBytes();

			dp = new DatagramPacket(b, b.length, iaddress, port);
			ds.send(dp);

			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));

			while (true) {
				int count = dis.read(b, 0, b.length);

				if (count == -1)
					break;

				dp = new DatagramPacket(b, count, iaddress, port);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
