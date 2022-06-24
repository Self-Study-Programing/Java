package FTP;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Input_Message extends Thread {
	private Socket sc = null;

	
	public Input_Message(Socket sc) {
		this.sc = sc;
	}

	public void fileList(){
		File dir = new File("/Users/seonghun/공부/spring/network/src/FTP/serverImg");
		File[] files = dir.listFiles();
		for (File name : files) {
			System.out.println(name.getName()+" ");
		}
	}
	
	public void run() {
		try {
			InputStream is = sc.getInputStream();		// 클라이언트 메시지 입력 받음
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String msg = br.readLine();
			switch (msg){
				case "파일목록":
					fileList();
					break;
				default: System.out.println("???");
			}
		} catch(Exception e) {
			System.out.println("연결 종료");
			e.printStackTrace();
		}
	}
}