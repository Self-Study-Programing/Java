package FTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args) {
        ServerSocket ss = null;
        try {
            ss = new ServerSocket(5050);  	// 서버 시작(클라이언트 접속 대기)

            System.out.println("서버가 시작되었습니다.");


            while(true) {
                Socket sc = ss.accept(); // 요청이 오기까지 기다림
                System.out.println(sc.getInetAddress() +": 접속하였습니다."); // getInetAddress -> 연결된 주소 반환

                InputStream is = sc.getInputStream();		// 클라이언트 메시지 입력 받음
                BufferedReader br = new BufferedReader(new InputStreamReader(is));

                try {
                    // 데이터 주고 받는 객체 생성
                    ClientAccept ca = new ClientAccept(sc);
                    Thread ct = new ClientThread(ca);
                    ct.start();
                } catch(Exception e) {
                    System.out.println("연결 종료");
                }
            }
        } catch(Exception e) {
        } finally {
            try {
                ss.close();
            } catch(IOException e) {}
        }
    }
}
