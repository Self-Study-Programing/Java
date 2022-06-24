package FTP;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ClientThread extends Thread {
	private static List<ClientThread> ClientList = (List<ClientThread>) Collections.synchronizedList(new ArrayList<ClientThread>());
	
	private ClientAccept ca = null;

	public ClientThread(ClientAccept ca) {
		this.ca = ca;
		ClientList.add(this);
	}

	public void uploadFile(String[] operator){
		String fileAddress = operator[0];
		String[] fileName = fileAddress.split("/");

		String fileName2 = "";
		if(operator.length >= 2){
			fileName2 = operator[operator.length - 1];
		}

//		System.out.println(fileAddress);
//		System.out.println(fileName[fileName.length-1]);
//		System.out.println(fileName2);

		try {
			if (fileName2.equals("")) {
				FileOutputStream fos = new FileOutputStream("/Users/seonghun/공부/spring/network/src/FTP/serverImg/"+fileName[fileName.length-1]);
				File file = new File(fileAddress);

				byte[] bytes = new byte[1024];
				int readbit = 0;
				FileInputStream dis = new FileInputStream(file);

				while ((readbit = dis.read(bytes)) != -1) {
					// 파일 전송
					fos.write(bytes, 0, readbit);
				}
				fos.close();
			}
		}catch (IOException e){
			e.printStackTrace();
		}
	}

	public void run() {
		try {
			OutputStream out = ca.sc.getOutputStream();
			PrintWriter pw = new PrintWriter(out, true);
			while(true) {
				String msg = ca.readMessage();

				if(msg.equals("exit")){
					ClientList.remove(this);
				}

				String[] operator = msg.split(":");

				switch(operator[0]){
					case "파일목록":
						pw.println("파일목록");
						break;
					case "업로드":
						uploadFile(operator[1].split(" "));
//						pw.println();
						break;
					default: System.out.println("없는 명령어 입니다");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("삭제");
			ClientList.remove(this);
		}
	}
}