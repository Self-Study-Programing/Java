package ex0509N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            Socket sc = new Socket("127.0.0.1",5000);
            OutputStream os = sc.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            pw.println("만나서 반갑습니다.");

            InputStream is = sc.getInputStream();		// 클라이언트 메시지 입력 받음
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            System.out.println(br.readLine());

        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
