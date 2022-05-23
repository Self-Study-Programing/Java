package file;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileCopyServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5050);
        Socket sc = ss.accept();

        InputStream is = sc.getInputStream();
        BufferedInputStream bir = new BufferedInputStream(is);
        DataInputStream dis = new DataInputStream(bir);

        FileOutputStream fos = new FileOutputStream("/Users/seonghun/Desktop/abc.png");

        byte[] bytes = new byte[1024];
        int readbit = 0;
        while ((readbit = dis.read(bytes)) != -1) {
            // 파일 전송
            fos.write(bytes, 0, readbit);
        }
    }
}
