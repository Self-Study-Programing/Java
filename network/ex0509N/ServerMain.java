package ex0509N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            ServerSocket ss = new ServerSocket(5000);

            Socket sc = ss.accept();

            InputStream is = sc.getInputStream();		// 클라이언트 메시지 입력 받음
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String msg = br.readLine();
            System.out.println(msg);

            OutputStream os = sc.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);

            Scanner scan = new Scanner(System.in);
            pw.println(scan.next());

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
