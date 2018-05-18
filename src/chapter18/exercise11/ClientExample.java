package chapter18.exercise11;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.1.11", 5001);
		OutputStream os = socket.getOutputStream();
		
		String filePath = 
				"C:\\Users\\Public\\Pictures\\Sample Pictures\\Tulips.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		
		// 파일 이름을 보냅니다.
		os.write(fileName.getBytes("UTF-8"));
		
		System.out.println("[파일 보내기 시작] " + fileName);
		
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(filePath));
		byte[] bytes = new byte[100];
		int readByteCount = -1;
		while ((readByteCount = fis.read(bytes)) != -1) {
			os.write(bytes, 0, readByteCount);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		fis.close();
		os.close();
		socket.close();
		
	}
}
