package FTP;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Output_Message extends Thread {
	private Socket sc = null;
	
	public Output_Message(Socket sc) {
		this.sc = sc;
	}

	private boolean LoginRequest(Scanner scan){
		String id = "";
		String password = "";
		System.out.print("Id를 입력해주세요: ");
		id = scan.nextLine();
		int failCount = 0;

		System.out.print("Password를 입력해주세요: ");
		password = scan.nextLine();

		while(!id.equals("admin") || !password.equals("1234")){
			System.out.println("로그인에 실패하였습니다. 다시 시도해주세요 " + (5 - ++failCount) + "회 남음");

			if(failCount >= 5){
				System.out.println("횟수 초과");
				return false;
			}

			System.out.print("Id를 입력해주세요: ");
			id = scan.nextLine();

			System.out.print("Password를 입력해주세요: ");
			password = scan.nextLine();
		}

		System.out.println("로그인에 성공하였습니다.");
		return true;
	}
	
	public void run() {
		// 세팅
		Scanner scan = new Scanner(System.in);
		OutputStream os = null;
		try {
			os = sc.getOutputStream();
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(os, true);

		// 실제 작동 코드
		try {
			String msg = "";

			boolean loginCheck =  LoginRequest(scan); // 로그인 확인

			while(loginCheck && (!(msg=scan.nextLine()).equals("exit"))){
				String type = "";
				if(msg.substring(0,1).equals("/")){
					if(msg.indexOf(' ') != -1) {
						type = msg.substring(1, msg.indexOf(' ')).trim();
						msg = msg.substring(msg.indexOf(' ')).trim();
					} else {
						type = msg.substring(1);
					}
				}else{
					System.out.println("잘못된 형식입니다, /로 명령어는 시작됩니다");
					continue;
				}
				if(type.equals("업로드")){
					String[] str;
					str = msg.split(" ");
					File file = new File("/Users/seonghun/공부/spring/network/src/FTP/serverImg/"+str[str.length-1]);
					String YN = "";
					if(file.exists()){
						System.out.print("덮어 씌우시겠습니까 (Y/N");
						YN = scan.nextLine();
					}

					if(YN.equals("N")||YN.equals("n")){
						System.out.println("취소되었습니다.");
						continue;
					}
				}
				pw.println(type + ":" + msg);
			}

		} catch(Exception e) {
			System.out.println("접속 종료");
			e.printStackTrace();
		}
	}
}