package chapter18.exercise11;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.1.11", 5001));

		System.out.println("[서버 시작]");

		Socket socket = serverSocket.accept();

		InputStream is = socket.getInputStream();

		byte[] bytes = new byte[1000];
		int readByteCount = -1;

		// 파일 이름 받기
		readByteCount = is.read(bytes);
		String fileName = new String(bytes, 0, readByteCount, "UTF-8");

		fileName = fileName.trim();

		System.out.println("[파일 받기 시작 ] " + fileName);

		File file = new File("C:/Temp/" + fileName);
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(file));
		while ((readByteCount = is.read(bytes)) != -1) {
			fos.write(bytes, 0, readByteCount);
		}
		System.out.println("[파일 받기 완료]");

		fos.close();
		is.close();
		socket.close();
		serverSocket.close();
		System.out.println("[서버 종료]");

	}
}
